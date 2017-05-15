
package com.example.ankitbansal.rxreviews_carwale.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sort {

    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("sortUrl")
    @Expose
    private String sortUrl;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSortUrl() {
        return sortUrl;
    }

    public void setSortUrl(String sortUrl) {
        this.sortUrl = sortUrl;
    }

}
