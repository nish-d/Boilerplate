package com.alphalabz.nishitadutta.boilerplate.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nishita on 05-08-2016.
 */
public class SampleFragment extends Fragment {

    View rootView;

    public SampleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //inflate the view for this fragment
        //rootView = inflater.inflate(R.layout.fragment_sample, container, false);

        return rootView;
    }
}
