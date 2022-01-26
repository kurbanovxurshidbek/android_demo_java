package com.example.demojavaproject.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.demojavaproject.R;

public class StaticFragment extends Fragment {
    private static final String KEY = "the_key";
    static StaticFragment fragment;

    public static StaticFragment newInstance(String s) {
        if (fragment == null)
            fragment = new StaticFragment();
        // Set the arguments.
        Bundle bundle = new Bundle();
        bundle.putString(KEY, s);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView = (TextView) fragment.findViewById(R.id.textView);

        // Use getArguments() to get the String argument set by the constructor with parameter.
        textView.setText(getArguments().getString(KEY));
        return fragment;
    }
}
