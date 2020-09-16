package com.okexcoin.common.okex.open.api.bean.futures.result

open class Index{
    private var instrument_id: String? = null
    private var index: String? = null
    private var timestamp: String? = null

    open fun getInstrument_id(): String? {
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String?) {
        this.instrument_id = instrument_id
    }

    open fun getIndex(): String? {
        return index
    }

    open fun setIndex(index: String?) {
        this.index = index
    }

    open fun getTimestamp(): String? {
        return timestamp
    }

    open fun setTimestamp(timestamp: String?) {
        this.timestamp = timestamp
    }
}