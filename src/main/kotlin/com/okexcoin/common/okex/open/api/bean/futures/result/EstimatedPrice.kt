package com.okexcoin.common.okex.open.api.bean.futures.result

open class EstimatedPrice{
    private lateinit var instrument_id: String
    private lateinit var settlement_price: String
    private lateinit var timestamp: String

    fun getTimestamp(): String{
        return timestamp
    }

    fun setTimestamp(timestamp: String){
        this.timestamp = timestamp
    }

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    fun getSettlement_price(): String{
        return settlement_price
    }

    fun setSettlement_price(settlement_price: String){
        this.settlement_price = settlement_price
    }

}