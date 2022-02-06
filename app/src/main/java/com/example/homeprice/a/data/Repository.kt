package com.example.homeprice.a.data

import com.example.homeprice.a.Cadastr
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repository {
    companion object {
        val api = Retrofit.Builder()
            .baseUrl(" https://apiegrn.ru/api/cadaster/search")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterf::class.java)
    }
        val appId = "6XB9-TYJK-SSMI-RHLT"

        suspend fun getApi(query: String, grouped: String):

                Cadastr = withContext(Dispatchers.IO) {
            api.getAp("$query,$grouped", appId)
        }
    }
