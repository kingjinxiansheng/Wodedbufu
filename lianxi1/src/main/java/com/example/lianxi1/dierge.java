package com.example.lianxi1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class dierge extends Fragment {


    private ExpandableListView ex;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_dierge, container, false);
         ex= (ExpandableListView) view.findViewById(R.id.listww);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        String [] name={"---朋友","---家人","---老婆"};
        String [][] name1={{"杜智宏","郭遥青","张傲东"},{"爸爸","妈妈"},{"罗慧欣"},};
        xiangqing0Activity activity = (xiangqing0Activity) getActivity();
        MyExAdapter myExAdapter = new MyExAdapter(activity,name,name1);
        ex.setAdapter(myExAdapter);
        super.onActivityCreated(savedInstanceState);
    }
}
