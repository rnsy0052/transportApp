package com.example.seemkay.seemotransport;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


/**
 * Created by emkay on 9/2/18.
 */

public class RegisterPageAdapter extends FragmentPagerAdapter {
    private static final int NUM_PAGES = 3;
    List<Fragment> fList;
    public RegisterPageAdapter(FragmentManager fm,List<Fragment> fList) {

        super(fm);
        this.fList = fList;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fList.get(position);
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}

