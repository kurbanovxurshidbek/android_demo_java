package com.example.demojavaproject.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.demojavaproject.R;
import com.example.demojavaproject.adapter.ViewPagerAdapter;
import com.example.demojavaproject.fragment.PageOneFragment;
import com.example.demojavaproject.fragment.PageTwoFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPagerActivity extends AppCompatActivity {

    static final String TAG = ViewPagerActivity.class.toString();

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        initViews();
    }

    void initViews() {
        viewPager = findViewById(R.id.viewpager);
        // setting up the adapter
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        // add the fragments
        viewPagerAdapter.add(new PageOneFragment(), "Page 1");
        viewPagerAdapter.add(new PageTwoFragment(), "Page 2");
        // Set the adapter
        viewPager.setAdapter(viewPagerAdapter);
        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
