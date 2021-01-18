package com.andredarmawan.github.api

import com.andredarmawan.github.data.model.DetailUserResponse
import com.andredarmawan.github.data.model.User
import com.andredarmawan.github.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 0c7ed5ba5ba44e341f9942e081caa5fb906388d9")
    fun getSearchUsers(
          @Query("q") query: String
    ):Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 0c7ed5ba5ba44e341f9942e081caa5fb906388d9")
    fun getUserDetail(
            @Path("username") username: String
    ):Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 0c7ed5ba5ba44e341f9942e081caa5fb906388d9")
    fun getFollowers(
            @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 0c7ed5ba5ba44e341f9942e081caa5fb906388d9")
    fun getFollowing(
            @Path("username") username: String
    ): Call<ArrayList<User>>

}