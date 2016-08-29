package com.swapnilborkar.retrofittwoexample.service;

import com.swapnilborkar.retrofittwoexample.model.GitRepoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by SWAPNIL on 29-08-2016.
 */
public interface APIService {

    @GET("users/{user}/repos")
    Call<List<GitRepoModel>> getRepos(@Path("user") String user);
}
