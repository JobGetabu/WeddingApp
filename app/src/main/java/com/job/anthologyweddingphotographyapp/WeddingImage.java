package com.job.anthologyweddingphotographyapp;

import android.support.annotation.DrawableRes;

/**
 * Created by Job on Friday : 7/13/2018.
 */
public class WeddingImage {

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
}
