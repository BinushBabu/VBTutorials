/*
 *
 * Copyright (c) 2017.  dev.cobb
 *   <p>
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   <p>
 *   http://www.apache.org/licenses/LICENSE-2.0
 *   <p>
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package dev.vbtutorials.rv_demo.ui.view;
/*
 * @author dev.cobb
 * @version 1.0
 * @since 22 may 2017
 */

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    private final int mSpace;
    private int mOrientation = -1;
    private boolean mNeedLeftSpacing = false;
    private int mSizeGridSpacingPx;
    private int mGridSize;


    public SpaceItemDecoration(int spaceInPx) {
        mSpace = spaceInPx;
    }


    public SpaceItemDecoration(int gridSpacingPx, int gridSize) {
        mSizeGridSpacingPx = gridSpacingPx;
        mGridSize = gridSize;
        mSpace = gridSpacingPx;

    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
                               RecyclerView.State state) {
        if (mSpace == 0) {
            return;
        }
        if (mOrientation == -1) {
            if (parent.getLayoutManager() instanceof LinearLayoutManager) {
                LinearLayoutManager layoutManager = (LinearLayoutManager) parent.getLayoutManager();
                mOrientation = layoutManager.getOrientation();
            } else {


                int frameWidth = (int) ((parent.getWidth() - (float) mSizeGridSpacingPx * (mGridSize - 1)) / mGridSize);
                int padding = parent.getWidth() / mGridSize - frameWidth;
                int itemPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
                if (itemPosition < mGridSize) {
                    outRect.top = 0;
                } else {
                    outRect.top = mSizeGridSpacingPx;
                }
                if (itemPosition % mGridSize == 0) {
                    outRect.left = 0;
                    outRect.right = padding;
                    mNeedLeftSpacing = true;
                } else if ((itemPosition + 1) % mGridSize == 0) {
                    mNeedLeftSpacing = false;
                    outRect.right = 0;
                    outRect.left = padding;
                } else if (mNeedLeftSpacing) {
                    mNeedLeftSpacing = false;
                    outRect.left = mSizeGridSpacingPx - padding;
                    if ((itemPosition + 2) % mGridSize == 0) {
                        outRect.right = mSizeGridSpacingPx - padding;
                    } else {
                        outRect.right = mSizeGridSpacingPx / 2;
                    }
                } else if ((itemPosition + 2) % mGridSize == 0) {
                    mNeedLeftSpacing = false;
                    outRect.left = mSizeGridSpacingPx / 2;
                    outRect.right = mSizeGridSpacingPx - padding;
                } else {
                    mNeedLeftSpacing = false;
                    outRect.left = mSizeGridSpacingPx / 2;
                    outRect.right = mSizeGridSpacingPx / 2;
                }
                outRect.bottom = 0;

            }
        }
        if (mOrientation == LinearLayoutManager.VERTICAL) {
            outRect.top = mSpace;
        } else {
            outRect.left = mSpace;
        }
    }











}