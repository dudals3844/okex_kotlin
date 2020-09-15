package com.okexcoin.common.okex.open.api.bean.futures.param

open class FindOrderParam{
    private lateinit var instrument_id: String
    private lateinit var order_type: String
    private lateinit var status: String
    private lateinit var algo_ids: String
    private lateinit var before: String
    private lateinit var after: String
    private lateinit var limit: String


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

    fun getStatus(): String{
        return status
    }

    fun setStatus(status: String){
        this.status = status
    }

    fun getAlgo_ids(): String{
        return algo_ids
    }

    fun setAlgo_ids(algo_ids: String){
        this.algo_ids = algo_ids
    }

    fun getBefore(): String{
        return before
    }

    fun setBefore(before: String){
        this.before = before
    }

    fun getAfter(): String{
        return after
    }

    fun setAfter(after: String){
        this.after = after
    }

    fun getLimit(): String{
        return limit
    }

    fun setLimit(limit: String){
        this.limit = limit
    }
}