package io.devstream.smartapp_team_five;

// pcsalt.example.customlistviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyBaseAdapter extends BaseAdapter {

    ArrayList<Appointment> myList = new ArrayList<Appointment>();
    LayoutInflater inflater;
    Context context;


    public MyBaseAdapter(Context context, ArrayList<Appointment> myList) {
        this.myList = myList;
        this.context = context;
        inflater = LayoutInflater.from(this.context);    // only context can also be used
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Appointment getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder mViewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.layout_list_item, null);
            mViewHolder = new MyViewHolder();
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }
        mViewHolder.tvClinic = detail(convertView, R.id.tvClinic, myList.get(position).getClinic_id());
        mViewHolder.tvDate = detail(convertView, R.id.tvDate, myList.get(position).getDate());
        mViewHolder.tvTime = detail(convertView, R.id.tvTime, myList.get(position).getTime());
        mViewHolder.tvGest = detail(convertView, R.id.tvGest, myList.get(position).getService_provider_id());

        return convertView;
    }

    // or you can try better way
    private TextView detail(View v, int resId, String text) {
        TextView tv = (TextView) v.findViewById(resId);
        tv.setText(text);
        return tv;
    }
/*
    private ImageView detail(View v, int resId, int icon) {
        ImageView iv = (ImageView) v.findViewById(resId);
        iv.setImageResource(icon); //

        return iv;
    }
*/
    private class MyViewHolder {
        TextView tvClinic, tvDate, tvTime, tvGest;
        //ImageView ivIcon;
    }

}
