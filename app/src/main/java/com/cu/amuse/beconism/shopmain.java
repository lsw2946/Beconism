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

import com.cu.amuse.beconism.Fragment.Shop.ShopViewAdapter;
import com.cu.amuse.beconism.Fragment.Shop.ShopViewItem;
import com.cu.amuse.beconism.Fragment.Shop.cafeteria;
import com.cu.amuse.beconism.Fragment.Shop.canival;
import com.cu.amuse.beconism.Fragment.Shop.riminigarden;
import com.cu.amuse.beconism.Fragment.Shop.thecaffe;


public class shopmain extends Fragment {

    private Fragment canival;
    private Fragment cafeteria;
    private Fragment riminigarden;
    private Fragment thecaffe;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static shopmain newInstance() {
        shopmain fragment = new shopmain();
        return fragment;
    }

    public shopmain() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shopmain, container, false);

        canival = new canival();
        cafeteria = new cafeteria();
        riminigarden = new riminigarden();
        thecaffe = new thecaffe();

        ListView listView;
        ShopViewAdapter adapter;

        //Adapter 생성
        adapter = new ShopViewAdapter();

        // 리스트뷰 참조 및 Adapter달기
        listView = (ListView) view.findViewById(R.id.shopMenu);
        listView.setAdapter(adapter);

        // 아이템 추가
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.image_shop_canival),
                "카니발푸드페어", "주중 : 11:30 - 20:00","주말 : 11:30 - 20:30","회전목마 옆") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.image_shop_cafeteria),
                "카페테리아", "주중 : 11:30 - 20:00","주말 : 11:30 - 20:30","고스트어드벤쳐 옆") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.image_shop_riminigarden),
                "리미니가든", "주중 : 10:00 - 22:00","주말 : 10:30 - 22:00","83타워 4층 광장") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.image_shop_thecaffe),
                "더 카페", "주중 : 10:00 - 21:30","주말 : 10:00 - 21:30","대공연장 앞") ;

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get TextView's Text
                ShopViewItem item = (ShopViewItem)parent.getItemAtPosition(position);

                String descStr2 = item.getDesc2();
                String descStr3 = item.getDesc3();
                String titleStr = item.getTitle();
                String descStr = item.getDesc();
                Drawable iconDrawable = item.getIcon();

                FragmentTransaction ft2 = getFragmentManager().beginTransaction();


                switch (position){
                    case 0:
                        ft2.replace(R.id.container,canival);
                        break;
                    case 1:
                        ft2.replace(R.id.container,cafeteria);
                        break;
                    case 2:
                        ft2.replace(R.id.container,riminigarden);
                        break;
                    case 3:
                        ft2.replace(R.id.container,thecaffe);
                        break;
                }

                ft2.addToBackStack(null);
                ft2.commit();

            }
        });

        return view;
    }
}
