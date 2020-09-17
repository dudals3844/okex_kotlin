package com.okexcoin.common.okex.open.api.bean.other

import lombok.Data
import java.util.List

@Data
open class SpotOrderBookDiff{
    private var contract: String? = null
    private lateinit var asks: List<SpotOrderBookItem>
    private lateinit var bids: List<SpotOrderBookItem>
    private var timestamp: String? = null
    private var checksum: Int? = null

    constructor(contract: String, asks: List<SpotOrderBookItem>, bids: List<SpotOrderBookItem>, timestamp: String, checksum: Int){
        this.contract = contract
        this.asks = asks
        this.bids = bids
        this.timestamp = timestamp
        this.checksum = checksum
    }

    open fun isEmpty(): Boolean{
        return bids.isEmpty() && asks.isEmpty()
    }

    open fun getContract(): String? {
        return contract
    }

    open fun getAsks(): List<SpotOrderBookItem?>? {
        return asks
    }

    open fun getBids(): List<SpotOrderBookItem?> {
        return bids
    }

    open fun getTimestamp(): String? {
        return timestamp
    }

    open fun getChecksum(): Int {
        return checksum!!
    }

    override fun toString(): String {
        val sb = StringBuilder("{\"instrument_id\":\"")
        sb.append(contract)
        sb.append("\",\"asks\":[")
        for (i in asks.indices) {
            if (i > 0) {
                sb.append(",")
            }
            sb.append(asks[i].toString())
        }
        sb.append("],\"bids\":[")
        for (i in bids.indices) {//indices는 익덱스 값을 이용 python의 len이랑 비슷
            if (i > 0) {
                sb.append(",")
            }
            sb.append(bids[i].toString())
        }
        sb.append("],\"timestamp\":\"")
        sb.append(timestamp)
        sb.append("\",\"checksum\":")
        sb.append(checksum)
        sb.append("}")
        return sb.toString()
    }

}