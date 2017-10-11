package com.example.lianxi1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView livi = (TextView) findViewById(R.id.livi);
        new  Thread(new Runnable() {
            @Override
            public void run() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Xiangqing2Activity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
            }
        }).start();
    }
}
