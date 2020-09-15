package com.okexcoin.common.okex.open.api.bean.futures.param

open class ChangeMarginMode{
    private lateinit var underlying: String
    private lateinit var margin_mode: String

    fun getUnderlying(): String{
        return underlying
    }

    fun setUnderlying(underlying: String){
        this.underlying = underlying
    }

    fun getMarginMode(): String{
        return margin_mode
    }

    fun setMarginMode(margin_mode: String){
        this.margin_mode = margin_mode
    }

}