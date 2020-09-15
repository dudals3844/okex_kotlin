package com.okexcoin.common.okex.open.api.bean.futures.param

open class ChangeLiquiMode{
    private lateinit var currency: String
    private lateinit var liqui_mode: String

    fun getCurrency(): String{
        return currency
    }

    fun setCurrency(currency: String){
        this.currency = currency
    }

    fun getLiqui_mode(): String{
        return liqui_mode
    }

    fun setLiqui_mode(liqui_mode: String){
        this.liqui_mode = liqui_mode
    }
}