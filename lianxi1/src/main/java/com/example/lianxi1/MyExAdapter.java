package com.example.lianxi1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

/**
 * Created by lenovo on 2017/5/21.
 */

public class MyExAdapter extends BaseExpandableListAdapter {
    private Context context;
    private String [] name;
    private String [][] name1;
    @Override
    public int getGroupCount() {
        return name.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return name1[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return name[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return name1[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    public MyExAdapter(Context context, String[] name, String[][] name1) {
        this.context = context;
        this.name = name;
        this.name1 = name1;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View inflate = View.inflate(context, R.layout.item_fulei, null);
        TextView viewById = (TextView) inflate.findViewById(R.id.fileiText);
        viewById.setText(name[groupPosition]);
        return inflate;

    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View inflate = View.inflate(context, R.layout.item_zilei, null);
        TextView viewById = (TextView) inflate.findViewById(R.id.zileiText);
        viewById.setText(name1[groupPosition][childPosition]);
        return inflate;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
