package com.example.demojavaproject.activity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demojavaproject.R;

public class AnimationActivity extends AppCompatActivity {

    ImageView iv_sample;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        initViews();
    }

    void initViews() {

        iv_sample = findViewById(R.id.iv_sample);
        Button b_zoom = findViewById(R.id.b_zoom);
        Button b_rotate = findViewById(R.id.b_rotate);
        Button b_fade = findViewById(R.id.b_fade);
        Button b_blink = findViewById(R.id.b_blink);
        Button b_move = findViewById(R.id.b_move);
        Button b_slide = findViewById(R.id.b_slide);

        b_zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
                iv_sample.startAnimation(animation);
            }
        });
        b_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                iv_sample.startAnimation(animation);
            }
        });
        b_fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                iv_sample.startAnimation(animation);
            }
        });
        b_blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
                iv_sample.startAnimation(animation);
            }
        });
        b_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                iv_sample.startAnimation(animation);
            }
        });
        b_slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
                iv_sample.startAnimation(animation);
            }
        });
    }
}
