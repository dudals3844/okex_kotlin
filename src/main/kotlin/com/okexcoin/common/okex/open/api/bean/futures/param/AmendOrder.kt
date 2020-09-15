package com.okexcoin.common.okex.open.api.bean.futures.param

open class AmendOrder{
    private lateinit var cancel_on_fail: String
    private lateinit var order_id: String
    private lateinit var client_oid: String
    private lateinit var request_id: String
    private lateinit var new_size: String
    private lateinit var new_price: String

    fun getCancle_on_fail(): String{
        return cancel_on_fail
    }

    fun setCancle_on_fail(cancle_on_fail: String){
        this.cancel_on_fail = cancel_on_fail
    }

    fun getOrder_id(): String{
        return order_id
    }

    fun setOrder_id(order_id: String){
        this.order_id = order_id
    }

    fun getClient_oid(): String{
        return client_oid
    }

    fun setClient_oid(client_oid: String){
        this.client_oid = client_oid
    }

    fun getRequest(): String{
        return request_id
    }

    fun setRequest_id(request_id: String){
        this.request_id = request_id
    }

    fun getNew_size(): String{
        return new_size
    }

    fun setNex_size(new_size: String){
        this.new_size = new_size
    }

    fun getNew_price(): String{
        return new_price
    }

    fun setNew_price(new_price: String){
        this.new_price = new_price
    }

}