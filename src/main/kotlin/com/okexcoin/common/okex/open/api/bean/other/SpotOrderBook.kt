package com.okexcoin.common.okex.open.api.bean.other

import com.google.common.hash.HashFunction
import com.google.common.hash.Hashing
import lombok.Data
import java.util.List

@Data
open class SpotOrderBook{
    private var contract: String? = null
    private var asks: List<SpotOrderBookItem>? = null
    private var bids: List<SpotOrderBookItem>? = null
    private var timestamp: String? = null
    private var checksum: Int? = null
    private var differ: OrderBookDiffer? = OrderBookDiffer()
    private var checksumer: OrderBookChecksumer? = OrderBookChecksumer()
    private var crc32: HashFunction = Hashing.crc32()

    constructor(contract: String, asks: List<SpotOrderBookItem>, bids: List<SpotOrderBookItem>, timestamp: String, checksum: Int){
        this.contract = contract
        this.asks = asks
        this.bids = bids
        this.timestamp = timestamp
        this.checksum = checksum
    }


    open fun check(): Boolean{
        if (bids == null || this.asks == null){
            return false
        }
        if (bids!!.size > 1){
            val p: SpotOrderBookItem = this.bids!!.get(0)
            for (i in 1 until bids!!.size) {
                if (bids!![i].getPrice().compareTo(p.getPrice()) > 0) {
                    return false
                }
            }

        }
        if (asks!!.size > 1){
            var p: SpotOrderBookItem = asks!!.get(0)
            for (i in 1 until asks!!.size){
                if (asks!!.get(i).getPrice().compareTo(p.getPrice()) < 0){
                    return false
                }
            }
        }
        return false
    }

    fun diff(that: SpotOrderBook): SpotOrderBookDiff{
        print(this.toString())
        print(that.timestamp + "  " + that.toString())

        val askDiff: List<SpotOrderBookItem> = this.diff(this.getAsks(), that.getAsks(), Comparator.naturalOrder(), 1)
        val bidDiff: List<SpotOrderBookItem> = this.diff(this.getBids(), that.getBids(), Comparator.naturalOrder(), 2)
        return SpotOrderBookDiff(this.contract, askDiff, bidDiff, that.timestamp, that.checksum)
    }

    fun diff(current: List<SpotOrderBookItem>?, snapshot: List<SpotOrderBookItem>?, comparator: Comparator<String>, order: Int): List<SpotOrderBookItem>?{
        return differ.diff(current, snapshot, comparator, order)
    }

    override fun toString(): String{
        var sb: StringBuilder = StringBuilder("{\"instrument_id\":\"")
        sb.append(contract)
        sb.append("\",\"asks\":[")
        for (i in 0 until asks!!.size){
            if (i > 0){
                sb.append(",")
            }
            sb.append(asks!!.get(i).toSting())
        }
        sb.append("],\"bids\":[")
        for (i in 0 until bids!!.size){
            if (i > 0){
                sb.append(",")
            }
            sb.append(bids!!.get(i).toString())
        }
        sb.append("],\"timestamp\":\"");
        sb.append(timestamp);
        sb.append("\",\"checksum\":");
        sb.append(this.checksum);
        sb.append("}");
        return sb.toString()
    }

    open fun getContract(): String? {
        return contract
    }

    open fun setContract(contract: String?) {
        this.contract = contract
    }

    open fun getAsks() :List<SpotOrderBookItem?>? {
        return asks
    }

    open fun setAsks(asks :List<SpotOrderBookItem?>?) {
        this.asks = asks
    }

    open fun getBids(): List<SpotOrderBookItem?>? {
        return bids
    }

    open fun setBids(bids :List<SpotOrderBookItem?>?) {
        this.bids = bids
    }

    open fun getTimestamp(): String? {
        return timestamp
    }

    open fun setTimestamp(timestamp: String?) {
        this.timestamp = timestamp
    }

    open fun getChecksum(): Int {
        return checksum!!
    }

    open fun setChecksum(checksum: Int) {
        this.checksum = checksum
    }

    open fun getDiffer(): OrderBookDiffer? {
        return differ
    }

    open fun setDiffer(differ: OrderBookDiffer?) {
        this.differ = differ
    }

    open fun getChecksumer(): OrderBookChecksumer? {
        return checksumer
    }

    open fun setChecksumer(checksumer: OrderBookChecksumer?) {
        this.checksumer = checksumer
    }

    open fun getCrc32(): HashFunction? {
        return crc32
    }

    open fun setCrc32(crc32: HashFunction?) {
        this.crc32 = crc32!!
    }


}


