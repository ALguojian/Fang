package test.expmle.com.fang;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.expmle.com.alguojianwheelview.WheelView;

public class Main2Activity extends Activity {

    @BindView(R.id.one)
    WheelView one;
    @BindView(R.id.two)
    WheelView two;
    @BindView(R.id.three)
    WheelView three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        init();
    }

    private void init() {


        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 9; i++) {

            strings.add("第" + i + "个");

        }

        one.setData(strings);
        two.setData(strings);
        three.setData(strings);

        one.setDefault(0);
        two.setDefault(2);
        three.setDefault(3);



        one.setOnSelectListener(new WheelView.OnSelectListener() {
            @Override
            public void endSelect(int id, String text) {

            }

            @Override
            public void selecting(int id, String text) {

            }
        });

    }
}
