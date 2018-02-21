package dev.vbtutorials.rv_demo.ui.adapter.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import dev.vbtutorials.rv_demo.R;

/**
 * Created by A0047 on 4/17/2017.
 */

public class HolderImage extends RecyclerView.ViewHolder {
    Context mContext;
    public ImageView iv_image;


    public HolderImage(View itemView, final Context mContext) {
        super(itemView);
        this.mContext = mContext;
        iv_image = (ImageView) itemView.findViewById(R.id.iv_image);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position = getAdapterPosition();

                Toast.makeText(mContext, "item position" + position + "\n" + "image selected", Toast.LENGTH_SHORT).show();

            }
        });
    }

}
