package com.koltech.cricscores.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.koltech.cricscores.activity.LastestNewsFragment;
import com.koltech.cricscores.activity.IPLFragment;
import com.koltech.cricscores.activity.LiveMatchFragment;
import com.koltech.cricscores.activity.RecentMatchFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                LiveMatchFragment tab1 = new LiveMatchFragment();
                return tab1;
            case 1:
                RecentMatchFragment tab2 = new RecentMatchFragment();
                return tab2;
            case 2:
                IPLFragment tab4 = new IPLFragment();
            return tab4;
            case 3:
                LastestNewsFragment tab3 = new LastestNewsFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}