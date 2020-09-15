package com.okexcoin.common.okex.open.api.bean.futures.param

import jdk.jfr.internal.consumer.StringParser

open class Order{
    private lateinit var instrument_id: String
    private lateinit var client_oid: String
    private lateinit var type: String
    private lateinit var size: String
    private lateinit var match_price: String
    private lateinit var order_type: String
    private lateinit var price: String

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    fun getType(): String{
        return type
    }

    fun setType(type: String){
        this.type = type
    }

    fun getPrice(): String{
        return price
    }

    fun setPrice(price: String){
        this.price = price
    }

    fun getSize(): String{
        return size
    }

    fun setSize(size: String){
        this.size = size
    }

    fun getMatch_price(): String{
        return match_price
    }

    fun setMatch_price(match_price: String){
        this.match_price = match_price
    }

    fun getOrder_type(): String{
        return order_type
    }

    fun setOrder_type(order_type: String){
        this.order_type = order_type
    }

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setinstrument_id(instrumnet_id: String){
        this.instrument_id = instrument_id
    }

    fun getClient_oid(): String{
        return client_oid
    }

    fun setClient_oid(client_oid: String){
        this.client_oid = client_oid
    }
}