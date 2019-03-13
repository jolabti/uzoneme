package xyz.jncode.myapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Newsfeeditem {

    @SerializedName("post_id")
    @Expose
    public String postId;
    @SerializedName("post_title")
    @Expose
    public String postTitle;
    @SerializedName("post_category_id")
    @Expose
    public String postCategoryId;
    @SerializedName("post_category")
    @Expose
    public String postCategory;
    @SerializedName("post_tag")
    @Expose
    public String postTag;
    @SerializedName("feature_img")
    @Expose
    public String featureImg;
    @SerializedName("post_title_masking")
    @Expose
    public String postTitleMasking;
    @SerializedName("post_author")
    @Expose
    public String postAuthor;
    @SerializedName("post_type")
    @Expose
    public String postType;
    @SerializedName("post_publish_date")
    @Expose
    public String postPublishDate;
    @SerializedName("post_slug")
    @Expose
    public String postSlug;
    @SerializedName("index")
    @Expose
    public Integer index;
    @SerializedName("post_slug_full")
    @Expose
    public String postSlugFull;
    @SerializedName("post_publish_timestamp")
    @Expose
    public Integer postPublishTimestamp;
    @SerializedName("feature_img_source")
    @Expose
    public String featureImgSource;




}
