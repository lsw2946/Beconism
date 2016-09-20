package com.cu.amuse.beconism;

import android.graphics.drawable.Drawable;

/**
 * Created by 상욱 on 2016-08-23.
 */
public class RideViewItem {
    private Drawable iconDrawable ;
    private String titleStr;
    private String descStr;

    public void setIcon(Drawable icon) {
        iconDrawable = icon;
    }

    public void setTitle(String title){
        titleStr = title;
    }

    public void setDesc(String desc){
        descStr = desc;
    }

    public Drawable getIcon(){
        return this.iconDrawable;
    }

    public String getTitle(){
        return this.titleStr;
    }

    public String getDesc(){
        return this.descStr;
    }
}
