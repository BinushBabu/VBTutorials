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
public class RecyclerLayoutManager extends LinearLayoutManager {

    /**
     * Instantiates a new Vertical layout manager.
     *
     * @param context the context
     */
    public RecyclerLayoutManager(Context context,int orientation) {
        super(context);
        setOrientation(orientation);
    }
}
