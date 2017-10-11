package com.example.lianxi1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    private ListView listv;
    private ArrayList<String> list;
    private xiangqing0Activity activity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank,container,false);
        listv = (ListView) view.findViewById(R.id.listv);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        list=new ArrayList<String>();
        for (int i = 0; i <10 ; i++) {
            list.add("我是A");
        }
        activity = (xiangqing0Activity)getActivity();
        MyAdpater myAdpater = new MyAdpater(list,activity);
        listv.setAdapter(myAdpater);
        super.onActivityCreated(savedInstanceState);
    }
}
