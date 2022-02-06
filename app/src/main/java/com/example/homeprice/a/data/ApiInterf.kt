package com.example.homeprice.a.data

import com.example.homeprice.a.Cadastr
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterf {
 @GET("/api/cadaster/search HTTP/1.1")
 suspend fun getAp(
     @Query ("query") query1 : String,
     @Query ("grouped") grouped1 : String,
 ) : Cadastr
}