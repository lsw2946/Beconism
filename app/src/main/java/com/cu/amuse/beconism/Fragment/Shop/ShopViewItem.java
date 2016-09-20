package com.cu.amuse.beconism.Fragment.Shop;

import android.graphics.drawable.Drawable;

/**
 * Created by 상욱 on 2016-08-24.
 */
public class ShopViewItem {
    private Drawable iconDrawable ;
    private String titleStr;
    private String descStr;
    private String descStr2;
    private String descStr3;

    public void setIcon(Drawable icon) {
        iconDrawable = icon;
    }

    public void setTitle(String title){
        titleStr = title;
    }

    public void setDesc(String desc){
        descStr = desc;
    }

    public void setDesc2(String desc2) { descStr2 = desc2; }

    public void setDesc3(String desc3) { descStr3 = desc3; }

    public Drawable getIcon(){
        return this.iconDrawable;
    }

    public String getTitle(){
        return this.titleStr;
    }

    public String getDesc(){
        return this.descStr;
    }

    public String getDesc2() { return this.descStr2; }

    public String getDesc3() { return this.descStr3; }
}
