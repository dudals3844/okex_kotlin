package com.okexcoin.common.okex.open.api.bean.futures.param

import kotlin.collections.List

open class CancleOrders{
    private lateinit var client_oids: List<String>
    private lateinit var order_ids: List<String>
    private lateinit var instrument_id: String


    fun getOrder_ids(): List<String>{
        return order_ids
    }

    fun setOrder_ids(order_ids: List<String>){
        this.order_ids = order_ids
    }

    fun getClient_oids(): Any{
        return client_oids
    }

    fun setClient_oids(client_oids: List<String>){
        this.client_oids = client_oids
    }

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }


}