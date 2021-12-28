package com.example.demojavaproject.activity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demojavaproject.R;
import com.example.demojavaproject.adapter.RecyclerAdapter;
import com.example.demojavaproject.model.Member;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initViews();
    }

    void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        ArrayList<Member> members = loadMembers();

        refreshAdapter(members);
    }

    ArrayList<Member> loadMembers() {
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.mipmap.ic_launcher, "Xurshidbek"));
        members.add(new Member(R.mipmap.ic_launcher_round, "Begzodbek"));
        members.add(new Member(R.mipmap.ic_launcher, "Xurshidbek"));
        members.add(new Member(R.mipmap.ic_launcher_round, "Begzodbek"));
        return members;
    }

    void refreshAdapter(ArrayList<Member> members) {
        RecyclerAdapter adapter = new RecyclerAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }

}
