package com.okexcoin.common.okex.open.api.bean.futures.result

open class Stats{
    private var product_id: String? = null
    private var open: Double? = null
    private var high: Double? = null
    private var low: Double? = null
    private var volume: Double? = null

    open fun getProduct_id(): String? {
        return product_id
    }

    open fun setProduct_id(product_id: String?) {
        this.product_id = product_id
    }

    open fun getOpen(): Double? {
        return open
    }

    open fun setOpen(open: Double?) {
        this.open = open
    }

    open fun getHigh(): Double? {
        return high
    }

    open fun setHigh(high: Double?) {
        this.high = high
    }

    open fun getLow(): Double? {
        return low
    }

    open fun setLow(low: Double?) {
        this.low = low
    }

    open fun getVolume(): Double? {
        return volume
    }

    open fun setVolume(volume: Double?) {
        this.volume = volume
    }
}