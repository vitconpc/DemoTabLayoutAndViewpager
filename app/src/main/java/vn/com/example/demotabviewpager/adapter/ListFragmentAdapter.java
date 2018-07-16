package vn.com.example.demotabviewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> mListFragment;
    private List<String> mListTitle;

    public ListFragmentAdapter(FragmentManager fm) {
        super(fm);
        mListFragment = new ArrayList<>();
        mListTitle = new ArrayList<>();
    }

    @Override
    public int getCount() {

        return mListFragment == null ? 0 : mListFragment.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mListFragment.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mListTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        mListFragment.add(fragment);
        mListTitle.add(title);
        notifyDataSetChanged();
    }
}
