package com.example.android.miwok;

public class word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageresource=NO_image;
    private static final int NO_image=-1;
    private int maudioResourceid;
    public word(String defaultTranslation,String miwokTranslation,int audiofile){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        maudioResourceid=audiofile;
    }
    public word(String defaultTranslation,String miwokTranslation,int imageresourceid,int audiofile){
        mMiwokTranslation=miwokTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageresource=imageresourceid;
        maudioResourceid=audiofile;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageresource(){
        return mImageresource;
    }
    public boolean hasimage(){
        return mImageresource !=NO_image ;
    }
    public int getMaudioResourceid(){
        return maudioResourceid;
    }
}

