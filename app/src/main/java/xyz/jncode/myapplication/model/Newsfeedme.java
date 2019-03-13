package xyz.jncode.myapplication.model;

import java.util.HashMap;
import java.util.Map;

public class Newsfeedme {

    String blockType;
    private String postId;
    private String postTitle;
    private String postCategoryId;
    private String postCategory;
    private String postTag;
    private String featureImg;
    private String postTitleMasking;
    private String postAuthor;
    private String postType;
    private String postPublishDate;
    private String postSlug;
    private Integer index;
    private String postSlugFull;
    private Integer postPublishTimestamp;
    private String featureImgSource;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Newsfeedme(

            String blockType,
            String postId,
            String postTitle,
            String postTitleMasking,
            String postAuthor,
            String postPublishDate,
            String featureImg
    ) {


                this.blockType=blockType;
                this.postId = postId;
                this.postTitle = postTitle;
                this.postTitleMasking = postTitleMasking;
                this.postAuthor = postAuthor;
                this.postPublishDate = postPublishDate;
                this.featureImg = featureImg;

    }


    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostCategoryId() {
        return postCategoryId;
    }

    public void setPostCategoryId(String postCategoryId) {
        this.postCategoryId = postCategoryId;
    }

    public String getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(String postCategory) {
        this.postCategory = postCategory;
    }

    public String getPostTag() {
        return postTag;
    }

    public void setPostTag(String postTag) {
        this.postTag = postTag;
    }

    public String getFeatureImg() {
        return featureImg;
    }

    public void setFeatureImg(String featureImg) {
        this.featureImg = featureImg;
    }

    public String getPostTitleMasking() {
        return postTitleMasking;
    }

    public void setPostTitleMasking(String postTitleMasking) {
        this.postTitleMasking = postTitleMasking;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostPublishDate() {
        return postPublishDate;
    }

    public void setPostPublishDate(String postPublishDate) {
        this.postPublishDate = postPublishDate;
    }

    public String getPostSlug() {
        return postSlug;
    }

    public void setPostSlug(String postSlug) {
        this.postSlug = postSlug;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getPostSlugFull() {
        return postSlugFull;
    }

    public void setPostSlugFull(String postSlugFull) {
        this.postSlugFull = postSlugFull;
    }

    public Integer getPostPublishTimestamp() {
        return postPublishTimestamp;
    }

    public void setPostPublishTimestamp(Integer postPublishTimestamp) {
        this.postPublishTimestamp = postPublishTimestamp;
    }

    public String getFeatureImgSource() {
        return featureImgSource;
    }

    public void setFeatureImgSource(String featureImgSource) {
        this.featureImgSource = featureImgSource;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getBlockType() {
        return blockType;
    }

    public void setBlockType(String blockType) {
        this.blockType = blockType;
    }

}
