package com.example.lianxi1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class xiangqing0Activity extends AppCompatActivity {
    BlankFragment na;
    dierge dierge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiangqing0);
        //需要按钮组
        RadioGroup anniu= (RadioGroup) findViewById(R.id.anniuzu);
        Button liaotian = (Button) findViewById(R.id.liaotina);
        Button lianxiren = (Button) findViewById(R.id.lianxiren);
        na=new BlankFragment();
        //获取一个管理者，开启一个实物，add添加的意思，最后显示
        getSupportFragmentManager().beginTransaction().add(R.id.livea,na).commit();
        anniu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                fanduan();
                switch (checkedId){
                    case R.id.liaotina:
                        if(na==null){
                        na=new BlankFragment();
                        getSupportFragmentManager().beginTransaction().add(R.id.livea,na).commit();
                        }else{
                        getSupportFragmentManager().beginTransaction().show(na).commit();
                        }
                    break;
                    case R.id.lianxiren:
                        if(dierge==null){
                        dierge = new dierge();
                        getSupportFragmentManager().beginTransaction().add(R.id.livea, dierge).commit();
                        }else{
                        getSupportFragmentManager().beginTransaction().show(dierge).commit();
                        }
                        break;
                }
            }
        });
//        liaotian.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(na==null) {
//                    na=new BlankFragment();
//                    getSupportFragmentManager().beginTransaction().add(R.id.livea,na).commit();
//                }else{
//                    getSupportFragmentManager().beginTransaction().hide(dierge).commit();
//                    getSupportFragmentManager().beginTransaction().show(na).commit();
//                }
//            }
//        });
//        lianxiren.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(dierge==null){
//                    dierge = new dierge();
//                    getSupportFragmentManager().beginTransaction().hide(na).commit();
//                    getSupportFragmentManager().beginTransaction().add(R.id.livea, dierge).commit();
//                }else if(na!=null&&dierge!=null){
//                    getSupportFragmentManager().beginTransaction().hide(na).commit();
//                    getSupportFragmentManager().beginTransaction().show(dierge).commit();
//                }
//            }
//        });

    }
    private void fanduan(){
        if(na!=null){
            getSupportFragmentManager().beginTransaction().hide(na).commit();
        }
        if(dierge!=null){
            getSupportFragmentManager().beginTransaction().hide(dierge).commit();
        }
    }
}
