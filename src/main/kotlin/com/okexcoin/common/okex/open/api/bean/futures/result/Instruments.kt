package com.okexcoin.common.okex.open.api.bean.futures.result

open class Instruments{
    private var instrument_id: String? = null
    private var underlying: String? = null
    private var base_currency: String? = null
    private var quote_currency: String? = null
    private var settlement_currency: String? = null
    private var contract_val: String? = null
    private var listing: String? = null
    private var delivery: String? = null
    private var tick_size: String? = null
    private var alias: String? = null
    private var is_inverse: String? = null
    private var contract_val_currency: String? = null
    private var trade_increment: String? = null

    open fun getInstrument_id(): String? {
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String?) {
        this.instrument_id = instrument_id
    }

    open fun getUnderlying(): String? {
        return underlying
    }

    open fun setUnderlying(underlying: String?) {
        this.underlying = underlying
    }

    open fun getBase_currency(): String? {
        return base_currency
    }

    open fun setBase_currency(base_currency: String?) {
        this.base_currency = base_currency
    }

    open fun getQuote_currency(): String? {
        return quote_currency
    }

    open fun setQuote_currency(quote_currency: String?) {
        this.quote_currency = quote_currency
    }

    open fun getSettlement_currency(): String? {
        return settlement_currency
    }

    open fun setSettlement_currency(settlement_currency: String?) {
        this.settlement_currency = settlement_currency
    }

    open fun getContract_val(): String? {
        return contract_val
    }

    open fun setContract_val(contract_val: String?) {
        this.contract_val = contract_val
    }

    open fun getListing(): String? {
        return listing
    }

    open fun setListing(listing: String?) {
        this.listing = listing
    }

    open fun getDelivery(): String? {
        return delivery
    }

    open fun setDelivery(delivery: String?) {
        this.delivery = delivery
    }

    open fun getTick_size(): String? {
        return tick_size
    }

    open fun setTick_size(tick_size: String?) {
        this.tick_size = tick_size
    }

    open fun getAlias(): String? {
        return alias
    }

    open fun setAlias(alias: String?) {
        this.alias = alias
    }

    open fun getIs_inverse(): String? {
        return is_inverse
    }

    open fun setIs_inverse(is_inverse: String?) {
        this.is_inverse = is_inverse
    }

    open fun getContract_val_currency(): String? {
        return contract_val_currency
    }

    open fun setContract_val_currency(contract_val_currency: String?) {
        this.contract_val_currency = contract_val_currency
    }

    open fun getTrade_increment(): String? {
        return trade_increment
    }

    open fun setTrade_increment(trade_increment: String?) {
        this.trade_increment = trade_increment
    }

    override fun toString(): String{
        return "Instruments{" +
                "instrument_id='" + instrument_id + '\'' +
                ", underlying='" + underlying + '\'' +
                ", base_currency='" + base_currency + '\'' +
                ", quote_currency='" + quote_currency + '\'' +
                ", settlement_currency='" + settlement_currency + '\'' +
                ", contract_val='" + contract_val + '\'' +
                ", listing='" + listing + '\'' +
                ", delivery='" + delivery + '\'' +
                ", tick_size='" + tick_size + '\'' +
                ", alias='" + alias + '\'' +
                ", is_inverse='" + is_inverse + '\'' +
                ", contract_val_currency='" + contract_val_currency + '\'' +
                ", trade_increment='" + trade_increment + '\'' +
                '}'
    }
}