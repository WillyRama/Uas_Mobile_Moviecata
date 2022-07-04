package com.example.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {

    @GET("/3/tv/popular?api_key=0ba708223346c1eec013ffb82a653da7")
    fun getTvList(): Call<TvResponse>
}