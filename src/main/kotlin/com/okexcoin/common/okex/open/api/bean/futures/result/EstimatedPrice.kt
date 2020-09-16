package com.okexcoin.common.okex.open.api.bean.futures.result

open class EstimatedPrice{
    private lateinit var instrument_id: String
    private lateinit var settlement_price: String
    private lateinit var timestamp: String

    open fun getTimestamp(): String{
        return timestamp
    }

    open fun setTimestamp(timestamp: String){
        this.timestamp = timestamp
    }

    open fun getInstrument_id(): String{
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    open fun getSettlement_price(): String{
        return settlement_price
    }

    open fun setSettlement_price(settlement_price: String){
        this.settlement_price = settlement_price
    }

}