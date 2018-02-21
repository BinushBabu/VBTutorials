package dev.vbtutorials.rv_demo.ui.view;


/**
 * The type Vertical layout manager.
 * fix the orientation on recycler view
 *
 * @author dev.Cobb
 * @version 1.0
 * @since 8 oct 2016
 */
public class RecyclerStaggeredGridLayoutManager extends android.support.v7.widget.StaggeredGridLayoutManager {
    /**
     * Creates a StaggeredGridLayoutManager with given parameters.
     *
     * @param spanCount   If orientation is vertical, spanCount is number of columns. If
     *                    orientation is horizontal, spanCount is number of rows.
     * @param orientation {@link #VERTICAL} or {@link #HORIZONTAL}
     */
    public RecyclerStaggeredGridLayoutManager(int spanCount, int orientation) {
        super(spanCount,orientation);

    }



}
