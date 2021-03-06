package com.sleticalboy.dailywork.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sleticalboy.dailywork.R;
import com.sleticalboy.dailywork.weight.xrecycler.adapter.XBaseHolder;
import com.sleticalboy.dailywork.weight.xrecycler.adapter.XRecyclerAdapter;

/**
 * Created on 18-2-7.
 *
 * @author sleticalboy
 * @version 1.0
 * @description
 */
public class ItemAdapter extends XRecyclerAdapter<Integer> {

    private Integer[] mObjects;

    public ItemAdapter(Context context, Integer[] dataArray) {
        super(context, dataArray);
        mObjects = dataArray;
    }

    @Override
    protected XBaseHolder onCreateItemHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(parent, R.layout.item_wheel_layout);
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public Integer getItemData(int position) {
        return mObjects[getCount() % mObjects.length];
    }

    static class ViewHolder extends XBaseHolder<Integer> {

        ImageView mImageView;

        public ViewHolder(ViewGroup parent, int res) {
            super(parent, res);
            mImageView = getView(R.id.image_view);
        }

        @Override
        protected void setData(Integer resId) {
            mImageView.setImageResource(resId);
        }
    }
}
