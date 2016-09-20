package com.cu.amuse.beconism.Fragment.Event;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cu.amuse.beconism.R;

/**
 * Created by asd12 on 2016-08-26.
 */
public class event1 extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public static event1 newInstance() {
        event1 fragment = new event1();
        return fragment;
    }

    public event1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event1, container, false);


        return view;

    }
}
