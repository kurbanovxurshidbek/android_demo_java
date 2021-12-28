package com.example.demojavaproject.activity;

import android.os.Bundle;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.demojavaproject.R;
import com.example.demojavaproject.adapter.MemberAdapter;
import com.example.demojavaproject.model.Member;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initViews();
    }

    void initViews() {
        listView = findViewById(R.id.listView);

        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(R.mipmap.ic_launcher, "Xurshidbek"));
        members.add(new Member(R.mipmap.ic_launcher_round, "Begzodbek"));
        members.add(new Member(R.mipmap.ic_launcher, "Xurshidbek"));
        members.add(new Member(R.mipmap.ic_launcher_round, "Begzodbek"));
        members.add(new Member(R.mipmap.ic_launcher, "Xurshidbek"));
        members.add(new Member(R.mipmap.ic_launcher_round, "Begzodbek"));
        members.add(new Member(R.mipmap.ic_launcher, "Xurshidbek"));
        members.add(new Member(R.mipmap.ic_launcher_round, "Begzodbek"));

        refreshAdapter(members);
    }

    void refreshAdapter(ArrayList<Member> members) {
        MemberAdapter adapter = new MemberAdapter(this, members);
        listView.setAdapter(adapter);
    }
}
