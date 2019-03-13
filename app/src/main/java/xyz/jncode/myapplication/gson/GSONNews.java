package xyz.jncode.myapplication.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import xyz.jncode.myapplication.model.Datas;
import xyz.jncode.myapplication.model.Newsfeeditem;

public class GSONNews {

    @SerializedName("loadmore_parameter")
    @Expose
    public String loadmoreParameter;
    @SerializedName("datas")
    @Expose
    public Datas datas;













}
