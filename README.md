[![](https://jitpack.io/v/helen-x/JitpackReleaseDemo.svg)](https://jitpack.io/#helen-x/JitpackReleaseDemo)

### 仿照ios实现的wheelView，方便实现三极联动等城市选择，时间选择等效果


![](http://ouvjn19yd.bkt.clouddn.com/video2gif_20170921_175658%5B1%5D.gif)

1.Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2.Add the dependency

```
dependencies {
	         compile 'com.github.ALguojian:android-WheelVIew:v1.2'
	}
```

|属性|说明|
|-|-|
|wheelview.setData()|设置数据|
|wheelview.setDefault()|设置默认显示第几个|
|setOnSelectListener|设置滑动监听|


|XML属性|说明|
|-|-|
|app:itemNumber|显示个数|
|app:lineColor="#ffff00"|分割线颜色|
|app:normalTextColor="#555"|默认颜色|
|app:selectedTextColor="#57caa1"|选中颜色|
|app:selectedTextSize="22sp"|字体大小|

更多用法如下所示：


布局如下

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="test.expmle.com.fang.Main2Activity">

    <LinearLayout
        android:layout_width="0dp"
        android:layout_height="200dp"
        android:layout_marginTop="8dp"
        android:orientation="horizontal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <test.expmle.com.alguojianwheelview.WheelView
            android:layout_width="0dp"
            android:id="@+id/one"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            app:itemNumber="3"
            app:lineColor="#cccccc"
            app:lineHeight="1.5dp"
            app:maskHight="32dp"
            app:noEmpty="true"
            app:normalTextColor="#777"
            app:normalTextSize="14sp"
            app:selectedTextColor="#ff000000"
            app:selectedTextSize="22sp"
            app:unitHight="50dp" />

        <test.expmle.com.alguojianwheelview.WheelView
            android:layout_width="0dp"
            android:id="@+id/two"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            app:itemNumber="3"
            app:lineColor="#cccccc"
            app:lineHeight="1.5dp"
            app:maskHight="32dp"
            app:noEmpty="true"
            app:normalTextColor="#777"
            app:normalTextSize="14sp"
            app:selectedTextColor="#ff000000"
            app:selectedTextSize="22sp"
            app:unitHight="50dp" />

        <test.expmle.com.alguojianwheelview.WheelView
            android:layout_width="0dp"
            android:id="@+id/three"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            app:itemNumber="3"
            app:lineColor="#cccccc"
            app:lineHeight="1.5dp"
            app:maskHight="32dp"
            app:noEmpty="true"
            app:normalTextColor="#777"
            app:normalTextSize="14sp"
            app:selectedTextColor="#ff000000"
            app:selectedTextSize="22sp"
            app:unitHight="50dp" />

    </LinearLayout>

</android.support.constraint.ConstraintLayout>



```



