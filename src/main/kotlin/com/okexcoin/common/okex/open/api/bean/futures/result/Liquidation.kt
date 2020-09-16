package com.okexcoin.common.okex.open.api.bean.futures.result

open class Liquidation{
    private var instrument_id: String? = null
    private var price: String? = null
    private var size: String? = null
    private var type: String? = null
    private var loss: String? = null
    private var created_at: String? = null


    open fun getPrice(): String? {
        return price
    }

    open fun setPrice(price: String?) {
        this.price = price
    }

    open fun getType(): String? {
        return type
    }

    open fun setType(type: String?) {
        this.type = type
    }

    open fun getLoss(): String? {
        return loss
    }

    open fun setLoss(loss: String?) {
        this.loss = loss
    }

    open fun getInstrument_id(): String? {
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String?) {
        this.instrument_id = instrument_id
    }

    open fun getSize(): String? {
        return size
    }

    open fun setSize(size: String?) {
        this.size = size
    }

    open fun getCreated_at(): String? {
        return created_at
    }

    open fun setCreated_at(created_at: String?) {
        this.created_at = created_at
    }
}