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

import com.cu.amuse.beconism.Fragment.Ride.RideViewAdapter;
import com.cu.amuse.beconism.Fragment.Ride.RideViewItem;
import com.cu.amuse.beconism.Fragment.Ride.aladin;
import com.cu.amuse.beconism.Fragment.Ride.andersen_house;
import com.cu.amuse.beconism.Fragment.Ride.boomerang;
import com.cu.amuse.beconism.Fragment.Ride.camel_back;
import com.cu.amuse.beconism.Fragment.Ride.flume_ride;
import com.cu.amuse.beconism.Fragment.Ride.ghost_adventure;
import com.cu.amuse.beconism.Fragment.Ride.marry_go_round;
import com.cu.amuse.beconism.Fragment.Ride.skycab;
import com.cu.amuse.beconism.Fragment.Ride.viking;

public class ridemain extends Fragment {

    private Fragment ghost_adventure;
    private Fragment aladin;
    private Fragment andersen_house;
    private Fragment boomerang;
    private Fragment camel_back;
    private Fragment flume_ride;
    private Fragment marry_go_round;
    private Fragment skycab;
    private Fragment viking;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static ridemain newInstance() {
        ridemain fragment = new ridemain();
        return fragment;
    }

    public ridemain() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ridemain, container, false);

        ghost_adventure = new ghost_adventure();
        aladin = new aladin();
        andersen_house = new andersen_house();
        boomerang = new boomerang();
        camel_back = new camel_back();
        flume_ride = new flume_ride();
        marry_go_round = new marry_go_round();
        skycab = new skycab();
        viking = new viking();




        ListView listView;
        RideViewAdapter adapter;

        //Adapter 생성
        adapter = new RideViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listView = (ListView) view.findViewById(R.id.rideMenu);
        listView.setAdapter(adapter);

        // 아이템 추가
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_ghost_adventure),
                "고스트 어드벤쳐", "짜릿한 어둠속의 공포를 경험해보세요.") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_aladin),
                "알라딘", "램프의 요정 지니가 지키는 모험의 성") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_flume_ride),
                "후룸라이드", "통나무배를 타고 숲 속 급류타기") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_viking),
                "바이킹", "야호~ 하늘과 내가 하나가 되는 기분") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_skycab),
                "하늘마차", "하늘을 날으는 은하철도 쌍마차!") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_camel_back),
                "카멜백", "낙타등을 타고 오르락! 내리락!") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_marry_go_round),
                "회전목마", "나는 공주~! 나는야 백마탄 기사~!") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_boomerang),
                "부메랑", "이월드만의 찌릿한 재미, 초고속 롤러코스터!") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ride_image_andersen_house),
                "안데르센하우스", "공원속 작은 공연장, 안데르센하우스") ;

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get TextView's Text
                RideViewItem item = (RideViewItem)parent.getItemAtPosition(position);

                String titleStr = item.getTitle();
                String descStr = item.getDesc();
                Drawable iconDrawable = item.getIcon();

                FragmentTransaction ft = getFragmentManager().beginTransaction();


                switch (position){
                    case 0:
                        ft.replace(R.id.container,ghost_adventure);
                        break;
                    case 1:
                        ft.replace(R.id.container,aladin);
                        break;
                    case 2:
                        ft.replace(R.id.container,flume_ride);
                        break;
                    case 3:
                        ft.replace(R.id.container,viking);
                        break;
                    case 4:
                        ft.replace(R.id.container,skycab);
                        break;
                    case 5:
                        ft.replace(R.id.container,camel_back);
                        break;
                    case 6:
                        ft.replace(R.id.container,marry_go_round);
                        break;
                    case 7:
                        ft.replace(R.id.container,boomerang);
                        break;
                    case 8:
                        ft.replace(R.id.container,andersen_house);
                        break;
                }

                ft.addToBackStack(null);
                ft.commit();

            }
        });

        return view;
    }
}
