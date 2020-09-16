package com.okexcoin.common.okex.open.api.bean.futures.result

import com.alibaba.fastjson.JSONArray
import java.util.List

open class Book{
    private lateinit var asks: JSONArray
    private lateinit var bids: JSONArray
    private lateinit var timestamp: String

    open fun getAsks(): JSONArray{
        return asks
    }

    open fun setAsks(asks: JSONArray){
        this.asks = asks
    }

    open fun getBids(): JSONArray{
        return bids
    }

    open fun setBids(bids: JSONArray){
        this.bids = bids
    }

    open fun getTimestamp(): String{
        return timestamp
    }

    open fun setTimestamp(timestamp: String){
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