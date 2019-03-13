package xyz.jncode.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

class Headline {

    @SerializedName("index")
    @Expose
    public Integer index;
    @SerializedName("block_type")
    @Expose
    public String blockType;
    @SerializedName("layout_type")
    @Expose
    public String layoutType;
    @SerializedName("datacount")
    @Expose
    public Integer datacount;

    @SerializedName("newsfeed")
    @Expose
    public List<Newsfeeditem> newsfeed = null;
}
