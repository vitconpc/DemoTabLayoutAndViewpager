package vn.com.example.demotabviewpager.view;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.com.example.demotabviewpager.R;
import vn.com.example.demotabviewpager.adapter.ListFragmentAdapter;
import vn.com.example.demotabviewpager.fragment.FirstFragment;
import vn.com.example.demotabviewpager.fragment.SecondFragment;
import vn.com.example.demotabviewpager.fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    private ListFragmentAdapter mFragmentAdapter;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        mFragmentAdapter.addFragment(new FirstFragment(), getString(R.string.title_first));
        mFragmentAdapter.addFragment(new SecondFragment(), getString(R.string.title_second));
        mFragmentAdapter.addFragment(new ThirdFragment(), getString(R.string.title_third));
        setTablayout();
    }

    private void setTablayout() {
        mTabLayout.getTabAt(0).setIcon(R.drawable.icon);
        mTabLayout.getTabAt(1).setIcon(R.drawable.icon);
        mTabLayout.getTabAt(2).setIcon(R.drawable.icon);
    }

    private void initView() {
        mFragmentAdapter = new ListFragmentAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.view_pager);
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager.setAdapter(mFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
