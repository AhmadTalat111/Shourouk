package com.example.android.shorouk;

/**
 * Created by hp on 07/10/2017.
 */

public class Shop {
    private String mShop;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    public Shop(String shop, String description){
        mShop = shop;
        mDescription = description;
    }
    public Shop(String shop, String description, int imageResourceId){
        mShop = shop;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }
    public String getShop(){
        return mShop;
    }
    public String getDescrption(){
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
