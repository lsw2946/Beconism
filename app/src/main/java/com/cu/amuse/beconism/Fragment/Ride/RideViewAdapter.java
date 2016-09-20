package com.cu.amuse.beconism.Fragment.Ride;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.cu.amuse.beconism.R;

import java.util.ArrayList;

/**
 * Created by 상욱 on 2016-08-23.
 */
public class RideViewAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<RideViewItem> listViewItemlist = new ArrayList<RideViewItem>();

    //ListViewAdapter 생성자
    public RideViewAdapter(){}

    //Adapter에 사용되는 데이터의 개수
    @Override
    public int getCount(){return listViewItemlist.size();}

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View return
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final int pos = position;
        final Context context = parent.getContext();

        // "Rideview_item" layout을 inflate 하여 convertView 참조 획득.
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.ride_item, parent, false);
        }

        // 화면에 표시될 View으로부터 위젯에 대한 참조 획득
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.rideImage);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.rideName) ;
        TextView descTextView = (TextView) convertView.findViewById(R.id.rideDescription) ;

        // Date Set에서 position에 위치한 데이터 참조 획득
        RideViewItem listViewItem = listViewItemlist.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        descTextView.setText(listViewItem.getDesc());

        return convertView;
    }

    // 지정한 위치에 있는 데이터와 관계된 아이템(row)의 ID 리턴
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴
    @Override
    public Object getItem(int position) {
        return listViewItemlist.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(Drawable icon, String title, String desc) {
        RideViewItem item = new RideViewItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDesc(desc);

        listViewItemlist.add(item);
    }

}
