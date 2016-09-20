package com.cu.amuse.beconism.Fragment.Shop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cu.amuse.beconism.R;

/**
 * Created by 상욱 on 2016-08-24.
 */
public class canival extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static canival newInstance() {
        canival fragment = new canival();
        return fragment;
    }

    public canival() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop_canival, container, false);


        return view;

    }
}
