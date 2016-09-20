package com.cu.amuse.beconism.Fragment.Ride;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cu.amuse.beconism.R;

/**
 * Created by 상욱 on 2016-08-24.
 */
public class camel_back extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static camel_back newInstance() {
        camel_back fragment = new camel_back();
        return fragment;
    }

    public camel_back() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ride_camel_back, container, false);


        return view;

    }
}

