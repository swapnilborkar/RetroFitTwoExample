package com.swapnilborkar.retrofittwoexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SWAPNIL on 29-08-2016.
 */
public class GitRepoModel {
    @SerializedName("name")
    private String name;

    public String getName()
    {
        return name;
    }
}
