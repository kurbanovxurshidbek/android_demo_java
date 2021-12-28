package com.example.demojavaproject.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demojavaproject.R;

public class AdvancedActivity extends AppCompatActivity {
    static final String TAG = AdvancedActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        initViews();
    }

    void initViews() {
        TextView textView = findViewById(R.id.textView);
        String text = "I know just how to #whister, And I know how to cry, I know just where to find the answer";

        Spannable spannable = new SpannableString(text);
        spannable.setSpan(new ForegroundColorSpan(Color.BLUE),18, 27, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannable);
    }
}
