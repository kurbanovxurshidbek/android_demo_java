package com.example.demojavaproject.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.demojavaproject.R;
import com.example.demojavaproject.adapter.ViewPagerAdapter;
import com.example.demojavaproject.fragment.PageOneFragment;
import com.example.demojavaproject.fragment.PageTwoFragment;
import com.example.demojavaproject.fragment.StaticFragment;
import com.google.android.material.tabs.TabLayout;

public class BackStackActivity extends AppCompatActivity {
    static final String TAG = BackStackActivity.class.toString();
    private Button b_first, b_second;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backstack);
        initViews();
        StaticFragment fragment = StaticFragment.newInstance("PDP");
        //StaticFragment fragment = new StaticFragment();
    }

    void initViews() {
        b_first = findViewById(R.id.b_first);
        b_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new PageOneFragment());
            }
        });
        b_second = findViewById(R.id.b_second);
        b_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new PageTwoFragment());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        String backStateName = fragment.getClass().getName();

        FragmentManager manager = getSupportFragmentManager();
        boolean fragmentPopped = manager.popBackStackImmediate(backStateName, 0);

        if (!fragmentPopped) { //fragment not in back stack, create it.
            FragmentTransaction ft = manager.beginTransaction();
            ft.replace(R.id.frameLayout, fragment);
            ft.addToBackStack(backStateName);
            ft.commit();
        }
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }
}
