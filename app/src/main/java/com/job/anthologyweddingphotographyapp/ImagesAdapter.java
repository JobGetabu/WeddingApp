package com.job.anthologyweddingphotographyapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Job on Friday : 7/13/2018.
 */
public class ImagesAdapter extends BaseAdapter {

    private Context mContext;
    private WeddingImage[] weddingImages;

    public ImagesAdapter(Context mContext, WeddingImage[] weddingImages) {
        this.mContext = mContext;
        this.weddingImages = weddingImages;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView dummyTextView = new TextView(mContext);
        dummyTextView.setText(String.valueOf(i));    //i is the position of item
        return dummyTextView;
    }
}
