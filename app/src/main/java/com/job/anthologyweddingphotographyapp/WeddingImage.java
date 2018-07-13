package com.job.anthologyweddingphotographyapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;

/**
 * Created by Job on Friday : 7/13/2018.
 */
public class WeddingImage implements Parcelable {

    private String imgNum;
    @DrawableRes
    private int imgRes;

    public WeddingImage(String imgNum,  @DrawableRes int imgRes) {
        this.imgNum = imgNum;
        this.imgRes = imgRes;
    }

    public String getImgNum() {
        return imgNum;
    }

    public void setImgNum(String imgNum) {
        this.imgNum = imgNum;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes( @DrawableRes int imgRes) {
        this.imgRes = imgRes;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.imgNum);
        dest.writeInt(this.imgRes);
    }

    protected WeddingImage(Parcel in) {
        this.imgNum = in.readString();
        this.imgRes = in.readInt();
    }

    public static final Parcelable.Creator<WeddingImage> CREATOR = new Parcelable.Creator<WeddingImage>() {
        @Override
        public WeddingImage createFromParcel(Parcel source) {
            return new WeddingImage(source);
        }

        @Override
        public WeddingImage[] newArray(int size) {
            return new WeddingImage[size];
        }
    };
}
