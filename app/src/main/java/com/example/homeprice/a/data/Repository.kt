package com.example.homeprice.a.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repository {
    companion object {
        val api = Retrofit.Builder()
            .baseUrl("https://apiegrn.ru/api/cadaster/search/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CurrentApi::class.java)
          val token = "OQZG-WJHA-HI9A-PEHF"
    }


        suspend fun getCurrentCadaster(query: String,grouped : Int): Response<CurrentCadaster>
            = withContext(Dispatchers.IO)  {
            api.getApp(token, query,grouped)
        }
    }

//      suspend fun getCurrentCadaster(query: String, grouped: Int):CurrentCadaster = withContext(Dispatchers.IO)  {
//            api.getApp(token, query, grouped )
//        }
//    }