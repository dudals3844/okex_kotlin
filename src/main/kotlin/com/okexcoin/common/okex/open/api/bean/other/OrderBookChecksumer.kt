package com.okexcoin.common.okex.open.api.bean.other

import com.google.common.hash.HashFunction
import com.google.common.hash.Hashing
import java.nio.charset.StandardCharsets

open class OrderBookChecksumer{
    private val crc32: HashFunction = Hashing.crc32()

    open fun <T: OrderBookItem<T>> checksum(asks: kotlin.collections.List<T>, bids: kotlin.collections.List<T>): Int {
        val s = StringBuilder()
        for (i in 0..24) {
            if (i < bids.size) {
                s.append(bids[i].getPrice().toString())
                s.append(":")
                s.append(bids[i].getSize())
                s.append(":")
            }
            if (i < asks.size) {
                s.append(asks[i].getPrice().toString())
                s.append(":")
                s.append(asks[i].getSize())
                s.append(":")
            }
        }
        val str: String
        str = if (s.length > 0) {
            s.substring(0, s.length - 1)
        } else {
            ""
        }
        return crc32.hashString(str, StandardCharsets.UTF_8).asInt()
    }
}