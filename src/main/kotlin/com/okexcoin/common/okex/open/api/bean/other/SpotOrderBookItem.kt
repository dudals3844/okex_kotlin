package com.okexcoin.common.okex.open.api.bean.other

import lombok.Data
import java.math.BigDecimal

@Data
open class SpotOrderBookItem : OrderBookItem<String>{
    private lateinit var price: String
    private lateinit var size: String
    private lateinit var numOrder: String
    constructor(price: String, size: String, numOrder: String){
        this.price = price
        this.size = size
        this.numOrder = numOrder
    }

    @Override
    override fun toString(): String{
        return "[\"" + price.toString() + "\",\"" + size + "\",\"" + numOrder + "\"]"
    }

    @Override
    override fun getPrice(): String{
        return price
    }

    @Override
    override fun getSize(): String {
        return size
    }

    open fun getNumOrder(): String{
        return numOrder
    }


}