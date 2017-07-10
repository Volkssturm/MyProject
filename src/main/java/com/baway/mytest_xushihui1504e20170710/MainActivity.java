package com.baway.mytest_xushihui1504e20170710;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
/**
 * com.baway.mytest_xushihui1504e20170710
 * 徐世辉  1503A
 * 类作用：本类---
 * 思路：
 * 1.自定义控件样式实现没问题
 * 2.定义数量变化的回调接口
 * 3.点击加减按钮数量改变
 * 4.编辑完数量时，Toast提示数量改变
 * 2017/7/10 9:13
 */
public class MainActivity extends AppCompatActivity {

    private NumberAddSubView mZujian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initdata();
    }

    private void initdata() {
        mZujian.setOnButtonClickListenter(new NumberAddSubView
                .OnButtonClickListenter() {
            @Override
            public void onButtonAddClick(View view, int value) {
                    Toast.makeText(MainActivity.this, "AddClick Vaule == " + value, Toast
                            .LENGTH_SHORT).show();
            }

            @Override
            public void onButtonSubClick(View view, int value) {
                    Toast.makeText(MainActivity.this, "SubClick Vaule == " + value, Toast
                            .LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
             mZujian = (NumberAddSubView) findViewById(R.id.zujian);
    }
}
