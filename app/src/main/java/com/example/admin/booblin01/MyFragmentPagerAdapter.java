package com.example.admin.booblin01;

/**
 * Created by Admin on 03.01.2016.
 */
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private String[] mTabTitles = new String[] { "Виски", "Водка", "Пиво", "Ром/Текила/Джин", "Ликеры/Настойки", "Напитки"};

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
                ViskiFragment viskiFragment = new ViskiFragment();
                return viskiFragment;

            case 1:
//                ExpandableFragment expandableFragment = new ExpandableFragment();
//                return expandableFragment;
                VodkaFragment vodkaFragment = new VodkaFragment();
                return vodkaFragment;
            case 2:
                BeerFragment beerFragment = new BeerFragment();
                return beerFragment;
            case 3:
                ShotFragment shotFragment = new ShotFragment();
                return shotFragment;
            case 4:
                BiterFragment biterFragment = new BiterFragment();
                return biterFragment;
            case 5:
                ColaFragment colaFragment = new ColaFragment();
                return colaFragment;

            default:
                viskiFragment = new ViskiFragment();
                return viskiFragment;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Генерируем заголовки на основе позиции
        return mTabTitles[position];
    }
}