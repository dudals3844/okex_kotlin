package com.okexcoin.common.okex.open.api.bean.futures.param

open class ClosePositions{
    private lateinit var instrument_id: String
    private lateinit var direction: String

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    fun getDirection(): String{
        return direction
    }

    fun setDirection(direction: String){
        this.direction = direction
    }
}