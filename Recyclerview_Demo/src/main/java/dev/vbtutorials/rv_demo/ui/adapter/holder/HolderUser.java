package dev.vbtutorials.rv_demo.ui.adapter.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import dev.vbtutorials.rv_demo.R;
import dev.vbtutorials.rv_demo.domain.User;

/**
 * Created by A0047 on 4/17/2017.
 */

public class HolderUser extends RecyclerView.ViewHolder {
    Context mContext;
    public TextView tv_Name, tv_Email, tv_Id;

    public User user;

    public HolderUser(View itemView, final Context mContext) {
        super(itemView);
        this.mContext = mContext;
        tv_Id = (TextView) itemView.findViewById(R.id.tv_id);
        tv_Name = (TextView) itemView.findViewById(R.id.tv_name);
        tv_Email = (TextView) itemView.findViewById(R.id.tv_email);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position = getAdapterPosition();

                Toast.makeText(mContext, "item position" + position + "\n" + user.toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }

}
