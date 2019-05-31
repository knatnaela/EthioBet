package com.natnaeladane.ethiobet.adapter;


import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.natnaeladane.ethiobet.fragment.AxumBet;
import com.natnaeladane.ethiobet.fragment.GalaxyBet;
import com.natnaeladane.ethiobet.fragment.HuluBet;
import com.natnaeladane.ethiobet.fragment.VamosBet;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;
    public ViewPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AxumBet();
            case 1:
                return new GalaxyBet();
            case 2:
                return new HuluBet();
            case 3:
                return new VamosBet();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
