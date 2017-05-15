
package com.example.ankitbansal.rxreviews_carwale.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReviewDetail {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("reviewDate")
    @Expose
    private String reviewDate;
    @SerializedName("reviewRate")
    @Expose
    private String reviewRate;
    @SerializedName("goods")
    @Expose
    private String goods;
    @SerializedName("bads")
    @Expose
    private String bads;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("purchasedAs ")
    @Expose
    private String purchasedAs;
    @SerializedName("fuelEconomy")
    @Expose
    private String fuelEconomy;
    @SerializedName("familarity")
    @Expose
    private String familarity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewRate() {
        return reviewRate;
    }

    public void setReviewRate(String reviewRate) {
        this.reviewRate = reviewRate;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getBads() {
        return bads;
    }

    public void setBads(String bads) {
        this.bads = bads;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPurchasedAs() {
        return purchasedAs;
    }

    public void setPurchasedAs(String purchasedAs) {
        this.purchasedAs = purchasedAs;
    }

    public String getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(String fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public String getFamilarity() {
        return familarity;
    }

    public void setFamilarity(String familarity) {
        this.familarity = familarity;
    }

}
