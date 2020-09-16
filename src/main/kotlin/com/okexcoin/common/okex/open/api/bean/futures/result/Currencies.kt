package com.okexcoin.common.okex.open.api.bean.futures.result

import kotlin.math.min

open class Currencies{
    private lateinit var id: String
    private lateinit var name: String
    private lateinit var min_size: String


    fun getId(): String{
        return id
    }

    fun setId(id: String){
        this.id = id
    }

    fun getName(): String{
        return name
    }

    fun setName(name: String){
        this.name = name
    }

    fun getMin_size(): String{
        return min_size
    }

    fun setMin_size(min_size: String){
        this.min_size = min_size
    }
}