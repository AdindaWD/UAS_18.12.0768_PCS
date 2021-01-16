package id.dinda.githubuser.api

import id.dinda.githubuser.data.model.DetailUserResponse
import id.dinda.githubuser.data.model.User
import id.dinda.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 80cf6c705cf12e493724accef93df41d36e32f8f")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 80cf6c705cf12e493724accef93df41d36e32f8f")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 80cf6c705cf12e493724accef93df41d36e32f8f")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 80cf6c705cf12e493724accef93df41d36e32f8f")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}