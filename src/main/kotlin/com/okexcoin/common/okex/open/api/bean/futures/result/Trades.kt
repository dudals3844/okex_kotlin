package com.okexcoin.common.okex.open.api.bean.futures.result

open class Trades{
    private var trade_id: String? = null
    private var side: String? = null
    private var price: String? = null
    private var qty: String? = null
    private var timestamp: String? = null


    open fun getTrade_id(): String? {
        return trade_id
    }

    open fun setTrade_id(trade_id: String?) {
        this.trade_id = trade_id
    }

    open fun getSide(): String? {
        return side
    }

    open fun setSide(side: String?) {
        this.side = side
    }


    open fun getPrice(): String? {
        return price
    }

    open fun setPrice(price: String?) {
        this.price = price
    }

    open fun getQty(): String? {
        return qty
    }

    open fun setQty(qty: String?) {
        this.qty = qty
    }

    open fun getTimestamp(): String? {
        return timestamp
    }

    open fun setTimestamp(timestamp: String?) {
        this.timestamp = timestamp
    }

    override fun toString(): String{
        return "Trades{" +
                "trade_id='" + trade_id + '\'' +
                ", side='" + side + '\'' +
                ", price='" + price + '\'' +
                ", qty='" + qty + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}'
    }

}