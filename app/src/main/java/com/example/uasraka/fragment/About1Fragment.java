package com.example.uasraka.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.uasraka.R;

// 10/08/2019 - 10116329 - Raka Guntur Alviansyah - IF-8


public class About1Fragment extends Fragment {


    public About1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about1, container, false);
    }

    public interface OnFragmentInteractionListener {
    }
}
