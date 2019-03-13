package xyz.jncode.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datas {

    @SerializedName("headline")
    @Expose
    public Headline headline;
    @SerializedName("newsfeed_1")
    @Expose
    public Newsfeed1 newsfeed1;
    @SerializedName("editors_pick")
    @Expose
    public EditorsPick editorsPick;
    @SerializedName("trending")
    @Expose
    public Trending trending;
    @SerializedName("newsfeed_2")
    @Expose
    public Newsfeed2 newsfeed2;
}
