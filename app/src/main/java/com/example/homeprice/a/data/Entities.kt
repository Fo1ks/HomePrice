package com.example.homeprice.a.data

data class CurrentCadaster (
    val objectsList : List<objects>
) {
    data class objects (
        val CADNOMER: String,
        val TYPE: String,
        val AREA: String
    )
}