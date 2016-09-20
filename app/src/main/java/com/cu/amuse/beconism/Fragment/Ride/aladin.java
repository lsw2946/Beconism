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
public class aladin extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static aladin newInstance() {
        aladin fragment = new aladin();
        return fragment;
    }

    public aladin() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ride_aladin, container, false);


        return view;

    }
}
