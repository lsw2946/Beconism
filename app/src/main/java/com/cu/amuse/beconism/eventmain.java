package com.cu.amuse.beconism;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.cu.amuse.beconism.Fragment.Event.EventViewAdapter;
import com.cu.amuse.beconism.Fragment.Event.EventViewItem;
import com.cu.amuse.beconism.Fragment.Event.event1;
import com.cu.amuse.beconism.Fragment.Event.event2;
import com.cu.amuse.beconism.Fragment.Event.event3;
import com.cu.amuse.beconism.Fragment.Event.event4;
import com.cu.amuse.beconism.Fragment.Event.event5;


public class eventmain extends Fragment {

    private Fragment event1;
    private Fragment event2;
    private Fragment event3;
    private Fragment event4;
    private Fragment event5;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static eventmain newInstance() {
        eventmain fragment = new eventmain();
        return fragment;
    }

    public eventmain() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event, container, false);

        event1 = new event1();
        event2 = new event2();
        event3 = new event3();
        event4 = new event4();
        event5 = new event5();



        ListView listView;
        EventViewAdapter adapter;

        //Adapter 생성
        adapter = new EventViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listView = (ListView) view.findViewById(R.id.eventMenu);
        listView.setAdapter(adapter);

        // 아이템 추가
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.thumbnail_1),
                "기간 : 2016년 08월 28일까지", "대상 : 이월드 방문고객") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.thumbnail_2),
                "기간 : 2016년 08월 28일까지", "대상 : 이월드 워터빌리지 패키지 이용고객") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.thumbnail_3),
                "기간 : 2016년 08월 28일까지", "대상 : 이월드 방문고객") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.thumbnail_4),
                "기간 : 2016년 10월 31일까지", "대상 : 동물농장 이용고객") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.thumbnail_5),
                "기간 : 2016년 12월 31일까지", "대상 : 자유이용권 구매고객") ;


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get TextView's Text
                EventViewItem item = (EventViewItem)parent.getItemAtPosition(position);

                String titleStr = item.getTitle();
                String descStr = item.getDesc();
                Drawable iconDrawable = item.getIcon();

                FragmentTransaction ft = getFragmentManager().beginTransaction();


                switch (position){
                    case 0:
                        ft.replace(R.id.container,event1);
                        break;
                    case 1:
                        ft.replace(R.id.container,event2);
                        break;
                    case 2:
                        ft.replace(R.id.container,event3);
                        break;
                    case 3:
                        ft.replace(R.id.container,event4);
                        break;
                    case 4:
                        ft.replace(R.id.container,event5);
                        break;
                    case 5:

                        break;
                }

                ft.addToBackStack(null);
                ft.commit();

            }
        });

        return view;
    }
}