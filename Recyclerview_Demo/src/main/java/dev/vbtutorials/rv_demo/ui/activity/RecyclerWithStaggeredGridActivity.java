package dev.vbtutorials.rv_demo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dev.vbtutorials.rv_demo.R;
import dev.vbtutorials.rv_demo.ui.adapter.ImageAdapterUser;
import dev.vbtutorials.rv_demo.ui.view.RecyclerStaggeredGridLayoutManager;
import dev.vbtutorials.rv_demo.ui.view.SpaceItemDecoration;


public class RecyclerWithStaggeredGridActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView = findViewById(R.id.rv_list);
        setUpAdapter();


    }


    /***
     * initializeGidRecycler
     * method used to   create Recycler list
     */
    public void initializeListRecyclerVertical() {
        recyclerView.setHasFixedSize(true);

        ///if you want a horizontal scrollview then change the orientation to  LinearLayoutManager.HORIZONTAL
        /*
         *spanCount   If orientation is vertical, spanCount is number of columns. If
         *                    orientation is horizontal, spanCount is number of rows.
         * orientation {@link #VERTICAL} or {@link #HORIZONTAL}
         */

        int spanCount = 2;
        int orientation = LinearLayoutManager.VERTICAL;
        recyclerView.setLayoutManager(new RecyclerStaggeredGridLayoutManager(spanCount, orientation));
        SpaceItemDecoration itemDecoration = new SpaceItemDecoration(10,spanCount);
        recyclerView.addItemDecoration(itemDecoration);

    }

    public void setUpAdapter() {
        initializeListRecyclerVertical();
        List<Integer> imageList = getImageList();
        ImageAdapterUser adapterUser = new ImageAdapterUser(imageList, RecyclerWithStaggeredGridActivity.this);
        recyclerView.setAdapter(adapterUser);
        adapterUser.notifyDataSetChanged();


    }


    public List<Integer> getImageList() {
        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.android_7_nougat);
        imageList.add(R.drawable.android_n);
        imageList.add(R.drawable.cupcake);
        imageList.add(R.drawable.trophy_robot);
        imageList.add(R.drawable.cardboard);
        imageList.add(R.drawable.lollipop);
        imageList.add(R.drawable.mashmallow);
        imageList.add(R.drawable.androideclair);
        return imageList;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(RecyclerWithStaggeredGridActivity.this, ActivityMain.class);
        startActivity(intent);
        finish();
    }
}
