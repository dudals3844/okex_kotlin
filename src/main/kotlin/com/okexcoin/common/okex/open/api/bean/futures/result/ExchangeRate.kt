package com.okexcoin.common.okex.open.api.bean.futures.result


open class ExchangeRate{
    private lateinit var instrument_id: String
    private var rate: Double? = null
    private lateinit var timestamp: String

    open fun getRate(): Double?{
        return rate
    }

    open fun setRate(rate: Double?){
        this.rate = rate
    }

    open fun getInstrument_id(): String{
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    open fun getTimestamp(): String{
        return timestamp
    }

    open fun setTimestamp(timestamp: String){
        this.timestamp = timestamp
    }


}