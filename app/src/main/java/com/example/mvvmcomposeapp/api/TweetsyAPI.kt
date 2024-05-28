package com.example.mvvmcomposeapp.api

import com.example.mvvmcomposeapp.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

    @GET("/v3/b/665486dfacd3cb34a84e650c?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String) : Response<List<TweetListItem>>

    @GET("/v3/b/665486dfacd3cb34a84e650c?meta=false")
    @Headers("X-JSON-Path: tweets..category")
    suspend fun getCategories(): Response<List<String>>
}