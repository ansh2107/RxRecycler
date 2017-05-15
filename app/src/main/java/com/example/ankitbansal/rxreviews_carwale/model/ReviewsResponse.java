
package com.example.ankitbansal.rxreviews_carwale.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReviewsResponse {

    @SerializedName("ratings")
    @Expose
    private List<Rating> ratings = null;
    @SerializedName("reviews")
    @Expose
    private List<Review> reviews = null;
    @SerializedName("sorts")
    @Expose
    private List<Sort> sorts = null;
    @SerializedName("versions")
    @Expose
    private List<Version> versions = null;
    @SerializedName("makeName")
    @Expose
    private String makeName;
    @SerializedName("makeId")
    @Expose
    private String makeId;
    @SerializedName("modelName")
    @Expose
    private String modelName;
    @SerializedName("modelId")
    @Expose
    private String modelId;
    @SerializedName("versionId")
    @Expose
    private String versionId;
    @SerializedName("reviewCount")
    @Expose
    private String reviewCount;
    @SerializedName("smallPicUrl")
    @Expose
    private String smallPicUrl;
    @SerializedName("largePicUrl")
    @Expose
    private String largePicUrl;
    @SerializedName("startPrice")
    @Expose
    private String startPrice;
    @SerializedName("nextPageReviewUrl")
    @Expose
    private String nextPageReviewUrl;
    @SerializedName("hostUrl")
    @Expose
    private String hostUrl;
    @SerializedName("originalImgPath")
    @Expose
    private String originalImgPath;

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Sort> getSorts() {
        return sorts;
    }

    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public String getMakeId() {
        return makeId;
    }

    public void setMakeId(String makeId) {
        this.makeId = makeId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(String reviewCount) {
        this.reviewCount = reviewCount;
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

    public String getNextPageReviewUrl() {
        return nextPageReviewUrl;
    }

    public void setNextPageReviewUrl(String nextPageReviewUrl) {
        this.nextPageReviewUrl = nextPageReviewUrl;
    }

    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    public String getOriginalImgPath() {
        return originalImgPath;
    }

    public void setOriginalImgPath(String originalImgPath) {
        this.originalImgPath = originalImgPath;
    }

}
