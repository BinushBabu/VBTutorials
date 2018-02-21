package dev.vbtutorials.rv_demo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import dev.vbtutorials.rv_demo.R;
import dev.vbtutorials.rv_demo.ui.adapter.holder.HolderUser;
import dev.vbtutorials.rv_demo.domain.User;

/**
 * Created by A0047 on 4/17/2017.
 */

public class UserAdapter extends RecyclerView.Adapter<HolderUser>{
    List<User> list;
    Context mContext;

    public UserAdapter(List<User> list, Context mContext) {

        this.list = list;
        this.mContext = mContext;

    }

    @Override
    public HolderUser onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.holder_user, parent, false);
        HolderUser holderUser= new HolderUser(itemView,mContext );

        return holderUser;
    }

    @Override
    public void onBindViewHolder(HolderUser holder, int position) {
        User user=list.get(position);
        holder.user=user;
        holder.tv_Id.setText(user.getId()+"");
        holder.tv_Name.setText(user.getName());
        holder.tv_Email.setText(user.getEmail());

    }

       @Override
    public int getItemCount() {
        return list.size();
    }



}
