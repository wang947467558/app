package com.example.zhangjian.jyb_01.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TableLayout;
import android.widget.TextView;


import com.example.zhangjian.jyb_01.R;
import com.example.zhangjian.jyb_01.base.BaseFragment;
import com.example.zhangjian.jyb_01.fragment.fragmenthomoe_fragment.Fragment_Job;
import com.example.zhangjian.jyb_01.fragment.fragmenthomoe_fragment.Fragment_School;
import com.example.zhangjian.jyb_01.fragment.fragmenthomoe_fragment.Framgment_Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangjian on 2016/12/12.
 */

public class Fragment_Home extends BaseFragment {
    private TextView textView;
    private LayoutInflater inflater;
    private View view;
    private ViewPager viewPager;
    private FragmentTabHost fragmentTabHost;
    private String textArray[] = {"校园新动态", "热门职位", "活动专区"};
    private Class<?> fragments[] = {Fragment_School.class, Fragment_Job.class, Framgment_Activity.class};

    //tabLayout视图属性
    private List<View> viewList = new ArrayList<>();
    private List<String> titList = new ArrayList<>();
    //ViewPager轮播图属性
    private ViewPager myViewPager;


    private List<ImageView> imgList = new ArrayList<>();


    private TabHost tableLayout;
    private View view1, view2, view3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home, null);

        initView();
        initViewPager();
        return view;
    }

    private void initViewPager() {


    }

    private void initView() {
        inflater = LayoutInflater.from(getActivity());
        fragmentTabHost = (FragmentTabHost) view.findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent_fragment_home);
        fragmentTabHost.getTabWidget().setDividerDrawable(null);

        for (int i = 0; i < fragments.length; i++) {
            TabHost.TabSpec tabSpec = fragmentTabHost.newTabSpec(textArray[i]).setIndicator(getItemView(i));
            fragmentTabHost.addTab(tabSpec, fragments[i], null);
        }
        tableLayout = (TabHost) view.findViewById(R.id.tabLayout_framghome);
        view1 = inflater.inflate(R.layout.fragment_school, null);
        view2 = inflater.inflate(R.layout.fragment_job, null);
        view3 = inflater.inflate(R.layout.fragment_activity, null);
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        titList.add("校园新动态");
        titList.add("热门职位");
        titList.add("活动专区");



    }

    private View getItemView(int i) {
        View view1 = inflater.inflate(R.layout.fragmenthome_tab_item_textview, null);
        TextView textView1 = (TextView) view1.findViewById(R.id.fragmenthome_tab_item_textView);
        textView1.setText(textArray[i]);
        return view1;

    }


}
