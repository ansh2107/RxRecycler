
package com.example.ankitbansal.rxreviews_carwale.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReviewsResponseDetail {

    @SerializedName("reviewDetail")
    @Expose
    private ReviewDetail reviewDetail;
    @SerializedName("shareUrl")
    @Expose
    private String shareUrl;
    @SerializedName("tinyShareUrl")
    @Expose
    private Object tinyShareUrl;
    @SerializedName("makeName")
    @Expose
    private String makeName;
    @SerializedName("modelId")
    @Expose
    private String modelId;
    @SerializedName("modelName")
    @Expose
    private String modelName;
    @SerializedName("versionId")
    @Expose
    private String versionId;
    @SerializedName("versionName")
    @Expose
    private String versionName;
    @SerializedName("smallPicUrl")
    @Expose
    private String smallPicUrl;
    @SerializedName("largePicUrl")
    @Expose
    private String largePicUrl;
    @SerializedName("startPrice")
    @Expose
    private String startPrice;
    @SerializedName("reviewId")
    @Expose
    private String reviewId;
    @SerializedName("reviewCommentsUrl")
    @Expose
    private String reviewCommentsUrl;
    @SerializedName("commentCount")
    @Expose
    private String commentCount;
    @SerializedName("originalImgPath")
    @Expose
    private String originalImgPath;
    @SerializedName("hostUrl")
    @Expose
    private String hostUrl;

    public ReviewDetail getReviewDetail() {
        return reviewDetail;
    }

    public void setReviewDetail(ReviewDetail reviewDetail) {
        this.reviewDetail = reviewDetail;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public Object getTinyShareUrl() {
        return tinyShareUrl;
    }

    public void setTinyShareUrl(Object tinyShareUrl) {
        this.tinyShareUrl = tinyShareUrl;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getSmallPicUrl() {
        return smallPicUrl;
    }

    public void setSmallPicUrl(String smallPicUrl) {
        this.smallPicUrl = smallPicUrl;
    }

    public String getLargePicUrl() {
        return largePicUrl;
    }

    public void setLargePicUrl(String largePicUrl) {
        this.largePicUrl = largePicUrl;
    }

    public String getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    public void setReviewCommentsUrl(String reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getOriginalImgPath() {
        return originalImgPath;
    }

    public void setOriginalImgPath(String originalImgPath) {
        this.originalImgPath = originalImgPath;
    }

    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

}
