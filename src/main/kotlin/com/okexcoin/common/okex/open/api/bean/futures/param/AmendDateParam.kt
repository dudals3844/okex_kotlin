package com.okexcoin.common.okex.open.api.bean.futures.param

import kotlin.collections.List

open class AmendDateParam{
    private lateinit var amend_data: List<AmendOrder>

    fun getAmend_data(): List<AmendOrder>{
        return amend_data
    }

    fun setAmend_data(amend_data: List<AmendOrder>){
        this.amend_data = amend_data

    }
}