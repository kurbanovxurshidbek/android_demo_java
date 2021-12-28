package com.example.demojavaproject.activity;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.demojavaproject.R;
import com.example.demojavaproject.model.User;

public class MainActivity extends AppCompatActivity {
    static final String TAG = MainActivity.class.toString();
    int LAUNCH_DETAIL = 1001;
    TextView tv_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        Log.d(TAG, "MainActivity onCreate");
    }

    void initViews() {
        tv_home = findViewById(R.id.tv_home);
        Button b_detail = findViewById(R.id.b_detail);
        b_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                User user = new User(11, "PDP");
//                openDetailActivity(user);
                //openListActivity();
                //openRecyclerActivity();
                //openAdvancedActivity();
                //openFragmentActivity();
                //openRuntimeActivity();
                //openViewPagerActivity();
                openAnimationActivity();
            }
        });
    }

    ActivityResultLauncher<Intent> detailLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        String text = data.getStringExtra("result");
                        Log.d(TAG, text);
                        tv_home.setText(text);
                    }
                }
            });


    void openDetailActivity(User user) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("user", user);
        detailLauncher.launch(intent);
    }

    void openListActivity() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    void openRecyclerActivity() {
        Intent intent = new Intent(this, RecyclerActivity.class);
        startActivity(intent);
    }


    void openAdvancedActivity() {
        Intent intent = new Intent(this, AdvancedActivity.class);
        startActivity(intent);
    }

    void openFragmentActivity() {
        Intent intent = new Intent(this, FragmentActivity.class);
        startActivity(intent);
    }

    void openRuntimeActivity() {
        Intent intent = new Intent(this, RuntimeActivity.class);
        startActivity(intent);
    }

    void openViewPagerActivity() {
        Intent intent = new Intent(this, ViewPagerActivity.class);
        startActivity(intent);
    }

    void openAnimationActivity() {
        Intent intent = new Intent(this, AnimationActivity.class);
        startActivity(intent);
    }
}