package com.example.homeprice.a.data

import retrofit2.Response
import retrofit2.http.*

interface CurrentApi {

 @Headers("Content-Type: application/json")
 @POST("/api/cadaster/search HTTP/1.1")
 suspend fun getApp(@Header("x-access-token") token: String = "OQZG-WJHA-HI9A-PEHF",
                    @Query ("query") query: String,
                    @Query("grouped") grouped : Int
                    ): Response<CurrentCadaster>

}


// @Query ("query") query1 : String,
//    @Query ("grouped") grouped1 : String
