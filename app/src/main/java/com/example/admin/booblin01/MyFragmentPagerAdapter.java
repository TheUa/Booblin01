package com.example.admin.booblin01;

/**
 * Created by Admin on 03.01.2016.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private String[] mTabTitles = new String[] { "Позиции", "Факт" };

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return mTabTitles.length;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                MinusFragment minusFragment = new MinusFragment();
                return minusFragment;

            case 1:
//                ExpandableFragment expandableFragment = new ExpandableFragment();
//                return expandableFragment;
                SumFragment sumFragment = new SumFragment();
                return sumFragment;

            default:
                minusFragment = new MinusFragment();
                return minusFragment;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Генерируем заголовки на основе позиции
        return mTabTitles[position];
    }
}