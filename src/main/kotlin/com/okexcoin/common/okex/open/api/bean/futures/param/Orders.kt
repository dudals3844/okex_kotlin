package com.okexcoin.common.okex.open.api.bean.futures.param


open class Orders{
    private lateinit var instrument_id: String
    private lateinit var orders_data: List<OrdersItem>

    fun getOrders_data(): List<OrdersItem>{
        return orders_data
    }

    fun setOrders_data(orders_data: List<OrdersItem>){
        this.orders_data = orders_data
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }
}