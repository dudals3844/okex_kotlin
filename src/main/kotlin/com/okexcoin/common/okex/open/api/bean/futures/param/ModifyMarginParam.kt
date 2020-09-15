package com.okexcoin.common.okex.open.api.bean.futures.param



open class ModifyMarginParam{
    private lateinit var instrument_id: String
    private lateinit var direction: String
    private lateinit var type: String
    private lateinit var amount: String

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

    fun getType(): String{
        return type
    }

    fun setType(type: String){
        this.type = type
    }

    fun getAmount(): String{
        return amount
    }

    fun setAmount(amount: String){
        this.amount = amount
    }
}