package com.example.homeprice.a

data class Cadastr (
    val objectsList : List<objects>
        ) {
    data class objects (
    val CADNOMER: String,
    val ADDRESS: String,
    val TYPE: String,
    val AREA :String,
    val CATEGORY: String
    )
}