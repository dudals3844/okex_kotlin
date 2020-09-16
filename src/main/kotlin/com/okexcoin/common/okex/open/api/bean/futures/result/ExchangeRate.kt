package com.okexcoin.common.okex.open.api.bean.futures.result


open class ExchangeRate{
    private lateinit var instrument_id: String
    private var rate: Double? = null
    private lateinit var timestamp: String

    fun getRate(): Double?{
        return rate
    }

    fun setRate(rate: Double?){
        this.rate = rate
    }

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    fun getTimestamp(): String{
        return timestamp
    }

    fun setTimestamp(timestamp: String){
        this.timestamp = timestamp
    }


}