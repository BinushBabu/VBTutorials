package dev.vbtutorials.rv_demo.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import dev.vbtutorials.rv_demo.R;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    Button bt_list, bt_grid,bt_recycler_with_card,bt_recycler_with_staggered_grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find views by id
        bt_list =  findViewById(R.id.bt_list);
        bt_grid =  findViewById(R.id.bt_grid);
        bt_recycler_with_card =  findViewById(R.id.bt_recycler_with_card);
        bt_recycler_with_staggered_grid=  findViewById(R.id.bt_recycler_with_staggered_grid);

        ////////////////////setup listener
        bt_list.setOnClickListener(this);
        bt_grid.setOnClickListener(this);
        bt_recycler_with_card.setOnClickListener(this);
        bt_recycler_with_staggered_grid.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.bt_list:
                intent = new Intent(ActivityMain.this, RecyclerListActivity.class);
                break;
            case R.id.bt_grid:
                intent = new Intent(ActivityMain.this, RecyclerGridActivity.class);
                break;
            case R.id.bt_recycler_with_card:
                intent = new Intent(ActivityMain.this, RecyclerWithCardActivity.class);
                break;
            case R.id.bt_recycler_with_staggered_grid:
                intent = new Intent(ActivityMain.this, RecyclerWithStaggeredGridActivity.class);
                break;
        }
        startActivity(intent);
        finish();

    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
