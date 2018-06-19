package com.ahmdkhled.wechat.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ahmdkhled.wechat.fragments.FriendReqFragment;
import com.ahmdkhled.wechat.fragments.PostsFragment;
import com.ahmdkhled.wechat.fragments.ProfileFrag;

/**
 * Created by Ahmed Khaled on 6/3/2018.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] fragments=new Fragment[]
            {new PostsFragment(),new FriendReqFragment(),new ProfileFrag()};
    private String[] tabs=new String[]{"Posts","Friend Reguest","profile"};

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}