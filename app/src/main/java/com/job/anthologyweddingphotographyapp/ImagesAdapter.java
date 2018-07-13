package com.job.anthologyweddingphotographyapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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

        final WeddingImage im = weddingImages[i];

        // 2
        if (view == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            view = layoutInflater.inflate(R.layout.single_item, null);
        }

        //init views

        final ImageView imageView = (ImageView)view.findViewById(R.id.single_image);
        final TextView numTextView = (TextView)view.findViewById(R.id.single_num);

        //assign

        imageView.setImageDrawable(ContextCompat.getDrawable(mContext, im.getImgRes()));
        numTextView.setText(im.getImgNum());

        return view;
    }
}
