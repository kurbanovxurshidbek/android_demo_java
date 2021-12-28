package com.example.demojavaproject.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.demojavaproject.R;

public class FirstFragment extends Fragment {
    private FirstListener listener;
    TextView tv_first;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        initViews(view);
        return view;
    }

    void initViews(View view){
        tv_first = view.findViewById(R.id.tv_first);
        Button b_first = view.findViewById(R.id.b_first);
        b_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onFirstSend("PDP");
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof  FirstListener){
            listener = (FirstListener) context;
        }else{
            throw new RuntimeException(context.toString() + " must implement FirstListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public void updateFirstText(String str){
        tv_first.setText(str);
    }

    public interface FirstListener{
        void onFirstSend(String str);
    }
}
