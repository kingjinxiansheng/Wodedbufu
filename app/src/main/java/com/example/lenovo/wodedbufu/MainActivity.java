package com.example.lenovo.wodedbufu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity {
    String [] name={"小名","小刚","小红"};
    String [][] neirong={{"拉肚子","吃粑粑","吃饱了"},{"吃多了","吐了","又吃回去了"},
            {"我看到了","也想吃","可惜没有"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件 下拉列表
        ExpandableListView listw = (ExpandableListView) findViewById(R.id.listww);
        //实例化布局
        MyAdapter myAdapter = new MyAdapter(name,neirong,MainActivity.this);
        //设置布局
        listw.setAdapter(myAdapter);
    }
}
