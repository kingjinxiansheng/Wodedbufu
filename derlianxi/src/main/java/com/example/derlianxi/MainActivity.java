package com.example.derlianxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar tou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这是=初始化标头菜单栏
       tou = (Toolbar) findViewById(R.id.biaotou);
        tou.setTitle("消息");
        tou.setSubtitle("第二个标题");
        //这是替换系统原来的标题布局
       setSupportActionBar(tou);
        //这是设置按钮的意思，在这个表格中的按钮
        tou.setNavigationIcon(R.mipmap.ic_launcher);
        //给按钮设置监听
        tou.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    //这是创建一个菜单的意思
    public boolean onCreateOptionsMenu(Menu menu) {
        //这是一个获取菜单的意思
       getMenuInflater().inflate(R.menu.item_buju,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return true;
    }
}
