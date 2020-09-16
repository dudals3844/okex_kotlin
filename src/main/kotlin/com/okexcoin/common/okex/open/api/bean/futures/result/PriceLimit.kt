package com.okexcoin.common.okex.open.api.bean.futures.result

open class PriceLimit{
    private var instrument_id: String? = null
    private var highest: String? = null
    private var lowest: String? = null
    private var timestamp: String? = null

    open fun getInstrument_id(): String? {
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String?) {
        this.instrument_id = instrument_id
    }

    open fun getTimestamp(): String? {
        return timestamp
    }

    open fun setTimestamp(timestamp: String?) {
        this.timestamp = timestamp
    }

    open fun getHighest(): String? {
        return highest
    }

    open fun setHighest(highest: String?) {
        this.highest = highest
    }

    open fun getLowest(): String? {
        return lowest
    }

    open fun setLowest(lowest: String?) {
        this.lowest = lowest
    }
}