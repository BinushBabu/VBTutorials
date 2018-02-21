package dev.vbtutorials.rv_demo.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import dev.vbtutorials.rv_demo.R;
import dev.vbtutorials.rv_demo.ui.adapter.holder.HolderImage;


/**
 * Created by A0047 on 4/17/2017.
 */

public class ImageAdapterUser extends RecyclerView.Adapter<HolderImage>{
    List<Integer> list;
    Context mContext;

    public ImageAdapterUser(List<Integer> list, Context mContext) {

        this.list = list;
        this.mContext = mContext;

    }

    @Override
    public HolderImage onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.holder_image, parent, false);
        HolderImage holderImage= new HolderImage(itemView,mContext);

        return holderImage;
    }

    @Override
    public void onBindViewHolder(HolderImage holder, int position) {
        Integer image_id=list.get(position);

        holder.iv_image.setImageDrawable(mContext.getResources().getDrawable(image_id));

    }

       @Override
    public int getItemCount() {
        return list.size();
    }



}
