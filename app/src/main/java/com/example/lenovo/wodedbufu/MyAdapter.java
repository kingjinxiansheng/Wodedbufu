package com.example.lenovo.wodedbufu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by lenovo on 2017/5/18.
 */

public class MyAdapter extends BaseExpandableListAdapter {
    private String [] name;
    private String [][] neirong;
    private Context context;

    public MyAdapter(String[] name, String[][] neirong, Context context) {
        this.name = name;
        this.neirong = neirong;
        this.context = context;
    }

    @Override
    //父类的长度
    public int getGroupCount() {
        return name.length;
    }

    @Override
    //子类的长度
    public int getChildrenCount(int groupPosition) {
        return neirong[groupPosition].length;
    }

    @Override
    //父类的对象
    public Object getGroup(int groupPosition) {
        return name[groupPosition];
    }

    @Override
    //子类的对象
    public Object getChild(int groupPosition, int childPosition) {
        return neirong[groupPosition][childPosition];
    }

    @Override
    //父类的点击位置的索引
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    //子类的点击位置的索引
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    //设置父类布局
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        //初始化父类的布局，
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_fulei, null);
        //舒适化父类的控件
        TextView viewById = (TextView) inflate.findViewById(R.id.fulei);
        //给父类的空进设置值
        viewById.setText(name[groupPosition]);
        return inflate;
    }

    @Override
    //设置子类的布局
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        //初始化子类的布局，
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_zilei, null);
        //舒适化子类的控件
        TextView viewById = (TextView) inflate.findViewById(R.id.zilei);
        //给子类的空进设置值
        viewById.setText(neirong[groupPosition][childPosition]);
        return inflate;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
