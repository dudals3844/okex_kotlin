package com.okexcoin.common.okex.open.api.bean.futures.result

import kotlin.math.min

open class Currencies{
    private lateinit var id: String
    private lateinit var name: String
    private lateinit var min_size: String


    open fun getId(): String{
        return id
    }

    open fun setId(id: String){
        this.id = id
    }

    open fun getName(): String{
        return name
    }

    open fun setName(name: String){
        this.name = name
    }

    open fun getMin_size(): String{
        return min_size
    }

    open fun setMin_size(min_size: String){
        this.min_size = min_size
    }
}