package com.example.demojavaproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demojavaproject.R;
import com.example.demojavaproject.model.Member;

import java.util.ArrayList;

public class MemberAdapter extends BaseAdapter {

    Context context;
    ArrayList<Member> members;
    LayoutInflater inflter;

    public MemberAdapter(Context context, ArrayList<Member> members) {
        this.context = context;
        this.members = members;
        this.inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return members.size();
    }

    @Override
    public Member getItem(int position) {
        return members.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflter.inflate(R.layout.item_member_list, null);
        ImageView iv_profile = convertView.findViewById(R.id.iv_profile);
        TextView tv_fullname = convertView.findViewById(R.id.tv_fullname);

        Member member = members.get(position);

        iv_profile.setImageResource(member.getProfile());
        tv_fullname.setText(member.getFullname());

        return convertView;
    }
}
