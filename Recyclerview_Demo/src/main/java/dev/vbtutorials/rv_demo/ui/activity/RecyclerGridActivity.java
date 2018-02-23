package dev.vbtutorials.rv_demo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dev.vbtutorials.rv_demo.R;
import dev.vbtutorials.rv_demo.domain.User;
import dev.vbtutorials.rv_demo.ui.adapter.UserAdapter;
import dev.vbtutorials.rv_demo.ui.view.RecyclerGridLayoutManager;
import dev.vbtutorials.rv_demo.ui.view.SpaceItemDecoration;


public class RecyclerGridActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recyclerView =  findViewById(R.id.rv_list);
        setUpAdapter();
    }


    /***
     * initializeGidRecycler
     * method used to   create Recycler Grid view
     */
    public void initializeGidRecycler() {

        recyclerView.setHasFixedSize(true);
        // span c
        RecyclerView.LayoutManager layoutManager = new RecyclerGridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        SpaceItemDecoration itemDecoration=new SpaceItemDecoration(10);
        recyclerView.addItemDecoration(itemDecoration);

    }

    public void setUpAdapter() {
        initializeGidRecycler();
        List<User> userList = getUserList();
        UserAdapter adapterUser = new UserAdapter(userList, RecyclerGridActivity.this);
        recyclerView.setAdapter(adapterUser);
        adapterUser.notifyDataSetChanged();

    }


    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "vidya", "v.android@gmail.com"));
        userList.add(new User(2, "binush", "b.android@gmail.com"));
        userList.add(new User(3, "Anti Rubin", "ar.android@gmail.com"));
        userList.add(new User(4, "James Gosling", "jg.android@gmail.com"));
        userList.add(new User(5, "vidya", "v.android@gmail.com"));
        userList.add(new User(6, "binush", "b.android@gmail.com"));
        userList.add(new User(8, "Anti Rubin", "ar.android@gmail.com"));
        userList.add(new User(9, "James Gosling", "jg.android@gmail.com"));
        userList.add(new User(10, "vidya", "v.android@gmail.com"));
        userList.add(new User(11, "binush", "b.android@gmail.com"));
        userList.add(new User(12, "Anti Rubin", "ar.android@gmail.com"));
        userList.add(new User(13, "James Gosling", "jg.android@gmail.com"));


        return userList;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(RecyclerGridActivity.this, ActivityMain.class);
        startActivity(intent);
        finish();
    }
}
