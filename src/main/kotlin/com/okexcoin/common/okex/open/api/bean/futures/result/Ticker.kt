package com.okexcoin.common.okex.open.api.bean.futures.result

open class Ticker{
    private var instrument_id: String? = null
    private var best_bid: String? = null
    private var best_ask: String? = null
    private var high_24h: String? = null
    private var low_24h: String? = null
    private var last: String? = null
    private var volume_24h: String? = null
    private var timestamp: String? = null
    private var last_qty: String? = null
    private var best_ask_size: String? = null
    private var best_bid_size: String? = null

    open fun getLast_qty(): String? {
        return last_qty
    }

    open fun setLast_qty(last_qty: String?) {
        this.last_qty = last_qty
    }

    open fun getBest_ask_size(): String? {
        return best_ask_size
    }

    open fun setBest_ask_size(best_ask_size: String?) {
        this.best_ask_size = best_ask_size
    }

    open fun getBest_bid_size(): String? {
        return best_bid_size
    }

    open fun setBest_bid_size(best_bid_size: String?) {
        this.best_bid_size = best_bid_size
    }



    open fun getInstrument_id(): String? {
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String?) {
        this.instrument_id = instrument_id
    }

    open fun getBest_bid(): String? {
        return best_bid
    }

    open fun setBest_bid(best_bid: String?) {
        this.best_bid = best_bid
    }

    open fun getBest_ask(): String? {
        return best_ask
    }

    open fun setBest_ask(best_ask: String?) {
        this.best_ask = best_ask
    }

    open fun getHigh_24h(): String? {
        return high_24h
    }

    open fun setHigh_24h(high_24h: String?) {
        this.high_24h = high_24h
    }

    open fun getLow_24h(): String? {
        return low_24h
    }

    open fun setLow_24h(low_24h: String?) {
        this.low_24h = low_24h
    }

    open fun getLast(): String? {
        return last
    }

    open fun setLast(last: String?) {
        this.last = last
    }

    open fun getVolume_24h(): String? {
        return volume_24h
    }

    open fun setVolume_24h(volume_24h: String?) {
        this.volume_24h = volume_24h
    }

    open fun getTimestamp(): String? {
        return timestamp
    }

    open fun setTimestamp(timestamp: String?) {
        this.timestamp = timestamp
    }

}