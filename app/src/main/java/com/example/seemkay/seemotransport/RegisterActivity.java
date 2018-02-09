package com.example.seemkay.seemotransport;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emkay on 8/2/18.
 */

public class RegisterActivity extends FragmentActivity {

    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
        List<Fragment> fragments = getFragments();
        mPager = (ViewPager) findViewById(R.id.viewpager);
        mPagerAdapter = new RegisterPageAdapter(getSupportFragmentManager(),fragments);
        mPager.setAdapter(mPagerAdapter);


    }

    private List<Fragment> getFragments() {
        List<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(RegisterFragment.newInstance("0"));
        fragmentList.add(RegisterFragment.newInstance("1"));
        fragmentList.add(RegisterFragment.newInstance("2"));
        return fragmentList;

    }






}
