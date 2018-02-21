package dev.vbtutorials.rv_demo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import dev.vbtutorials.rv_demo.R;
import dev.vbtutorials.rv_demo.domain.User;
import dev.vbtutorials.rv_demo.ui.adapter.UserAdapter;
import dev.vbtutorials.rv_demo.ui.view.RecyclerLayoutManager;
import dev.vbtutorials.rv_demo.ui.view.SpaceItemDecoration;


public class RecyclerListActivity extends AppCompatActivity {
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
     * method used to   create Recycler list
     */
    public void initializeListRecyclerVertical() {
        recyclerView.setHasFixedSize(true);
        ///if you want a horizontal scrollview then change the orientation to  LinearLayoutManager.HORIZONTAL
        recyclerView.setLayoutManager(new RecyclerLayoutManager(RecyclerListActivity.this, LinearLayoutManager.VERTICAL));
        recyclerView.addItemDecoration(new SpaceItemDecoration(10));

    }

    public void setUpAdapter() {
        initializeListRecyclerVertical();
        List<User> userList = getUserList();
        UserAdapter adapterUser = new UserAdapter(userList, RecyclerListActivity.this);
        recyclerView.setAdapter(adapterUser);
        adapterUser.notifyDataSetChanged();


    }


    public List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Vidya", "v.android@gmail.com"));
        userList.add(new User(2, "Binush", "b.android@gmail.com"));
        userList.add(new User(3, "Anti Rubin", "ar.android@gmail.com"));
        userList.add(new User(4, "James Gosling", "jg.android@gmail.com"));
        userList.add(new User(5, "Vidya", "v.android@gmail.com"));
        userList.add(new User(6, "Binush", "b.android@gmail.com"));
        userList.add(new User(8, "Anti Rubin", "ar.android@gmail.com"));
        userList.add(new User(9, "James Gosling", "jg.android@gmail.com"));
        userList.add(new User(10, "Vidya", "v.android@gmail.com"));
        userList.add(new User(11, "Binush", "b.android@gmail.com"));
        userList.add(new User(12, "Anti Rubin", "ar.android@gmail.com"));
        userList.add(new User(13, "James Gosling", "jg.android@gmail.com"));


        return userList;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(RecyclerListActivity.this, ActivityMain.class);
        startActivity(intent);
        finish();
    }
}
