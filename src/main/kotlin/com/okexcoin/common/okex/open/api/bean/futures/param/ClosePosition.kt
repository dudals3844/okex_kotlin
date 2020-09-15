package com.okexcoin.common.okex.open.api.bean.futures.param

open class ClosePosition{
    private lateinit var instrument_id: String
    private var type: Int? = null

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    fun getType(): Int?{
        return type
    }

    fun setType(type: Int){
        this.type = type
    }

}