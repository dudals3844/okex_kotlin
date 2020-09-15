package com.okexcoin.common.okex.open.api.bean.futures.param


open class ModifyFixedMargin{
    private lateinit var underlying: String
    private lateinit var type: String

    fun getUnderlying():String{
        return underlying
    }

    fun setUnderlying(underlying: String){
        this.underlying = underlying
    }

    fun getType(): String{
        return type
    }

    fun setType(type: String){
        this.type = type
    }
}