package com.okexcoin.common.okex.open.api.bean.futures.result

class Holds{
    private var instrument_id: String? = null
    private var amount: String? = null
    private var timestamp: String? = null

    open fun getInstrument_id(): String? {
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String?) {
        this.instrument_id = instrument_id
    }

    open fun getAmount(): String? {
        return amount
    }

    open fun setAmount(amount: String?) {
        this.amount = amount
    }

    open fun getTimestamp(): String? {
        return timestamp
    }

    open fun setTimestamp(timestamp: String?) {
        this.timestamp = timestamp
    }
}