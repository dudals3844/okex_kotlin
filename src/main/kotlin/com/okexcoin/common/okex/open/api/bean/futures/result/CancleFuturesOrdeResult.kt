package com.okexcoin.common.okex.open.api.bean.futures.result

import jdk.jfr.internal.consumer.StringParser

open class CancleFuturesOrdeResult{
    private lateinit var instrument_id: String
    private lateinit var order_type: String
    private lateinit var algo_ids: String
    private lateinit var error_code: String
    private lateinit var error_message: String
    private lateinit var result: String

    fun getError_code(): String{
        return error_code
    }

    fun setError_code(error_code: String){
        this.error_code = error_code
    }

    fun getError_message(): String{
        return error_message
    }

    fun setError_message(error_message: String){
        this.error_message = error_message
    }

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    fun getOrder_type(): String{
        return order_type
    }

    fun setOrder_type(order_type: String){
        this.order_type = order_type
    }

    fun getAlgo_ids(): String{
        return algo_ids
    }

    fun setAlgo_ids(algo_ids: String){
        this.algo_ids = algo_ids
    }

    fun getResult(): String{
        return result
    }

    fun setResult(result: String){
        this.result = result
    }




}