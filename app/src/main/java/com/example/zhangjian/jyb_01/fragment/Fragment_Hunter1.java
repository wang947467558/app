package com.example.zhangjian.jyb_01.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zhangjian.jyb_01.R;


/**
 * Created by zhangjian on 2016/12/12.
 */

public class Fragment_Hunter1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hunter, container, false);
        return view;
    }
}
