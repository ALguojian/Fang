### 仿照ios实现的wheelView，方便实现三极联动等城市选择，时间选择等效果


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
	        compile 'com.github.ALguojian:android-WheelVIew:v1.1'
	}
```

|属性|说明|
|-|-|
|wheelview.setData()|设置数据|
|wheelview.setDefault()|设置默认显示第几个|
|setOnSelectListener|设置滑动监听|


布局如下

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#fff"
    tools:context="test.expmle.com.alguojianwheelview.MainActivity">
    
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
            android:layout_weight="1"
            android:layout_height="wrap_content" />

        <test.expmle.com.alguojianwheelview.WheelView
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content" />

        <test.expmle.com.alguojianwheelview.WheelView
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content" />
        
    </LinearLayout>
</android.support.constraint.ConstraintLayout>


```



