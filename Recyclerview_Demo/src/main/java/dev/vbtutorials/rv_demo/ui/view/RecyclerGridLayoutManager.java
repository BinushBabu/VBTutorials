package dev.vbtutorials.rv_demo.ui.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;


/**
 * The type Vertical layout manager.
 * fix the orientation on recycler view
 *
 * @author dev.Cobb
 * @version 1.0
 * @since 8 oct 2016
 */
public class RecyclerGridLayoutManager extends android.support.v7.widget.GridLayoutManager {


    public RecyclerGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
        setOrientation(LinearLayoutManager.VERTICAL);
    }
}
