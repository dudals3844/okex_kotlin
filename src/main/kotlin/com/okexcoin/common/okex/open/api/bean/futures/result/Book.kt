package com.okexcoin.common.okex.open.api.bean.futures.result

import com.alibaba.fastjson.JSONArray
import java.util.List

open class Book{
    private lateinit var asks: JSONArray
    private lateinit var bids: JSONArray
    private lateinit var timestamp: String

    fun getAsks(): JSONArray{
        return asks
    }

    fun setAsks(asks: JSONArray){
        this.asks = asks
    }

    fun getBids(): JSONArray{
        return bids
    }

    fun setBids(bids: JSONArray){
        this.bids = bids
    }

    fun getTimestamp(): String{
        return timestamp
    }

    fun setTimestamp(timestamp: String){
        this.timestamp = timestamp
    }

    @Override
    override fun toString(): String{
        return "Book{" +
                "asks=" + asks +
                ", bids=" + bids +
                ", timestamp='" + timestamp + '\'' +
                '}'
    }
}