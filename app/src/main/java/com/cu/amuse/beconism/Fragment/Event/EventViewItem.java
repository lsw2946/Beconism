package com.cu.amuse.beconism.Fragment.Event;

import android.graphics.drawable.Drawable;

/**
 * Created by asd12 on 2016-08-26.
 */
public class EventViewItem {
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