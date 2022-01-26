package com.example.demojavaproject.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        spannable.setSpan(new ForegroundColorSpan(Color.BLUE), 18, 27, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannable);

        EditText et_key = findViewById(R.id.et_key);
        et_key.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_DONE) {
                    Log.d("TAG","Keyboard done pressed");
                }
                return false;
            }
        });

    }
}
