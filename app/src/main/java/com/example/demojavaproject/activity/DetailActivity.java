package com.example.demojavaproject.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demojavaproject.R;
import com.example.demojavaproject.model.User;

public class DetailActivity extends AppCompatActivity {
    static final String TAG = DetailActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
    }

    void initViews() {

//        TextView tv_detail = findViewById(R.id.tv_detail);
//        Button b_exit = findViewById(R.id.b_exit);
//        b_exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                backToFinish();
//            }
//        });
//        User user = (User)getIntent().getSerializableExtra("user");
//        Log.d(TAG, user.toString());
//        tv_detail.setText(user.toString());
    }

    void backToFinish() {
        Intent intent = new Intent();
        intent.putExtra("result", "Thanks a lot!");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
