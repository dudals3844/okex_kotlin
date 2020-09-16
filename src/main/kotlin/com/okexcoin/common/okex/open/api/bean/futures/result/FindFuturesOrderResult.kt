package com.okexcoin.common.okex.open.api.bean.futures.result

open class FindFuturesOrderResult{
    private lateinit var instrument_id: String
    private lateinit var order_type: String
    private lateinit var timestamp: String
    private lateinit var rejected_at: String
    private lateinit var algo_id: String
    private lateinit var status: String
    private lateinit var type: String
    private lateinit var leverage: String
    private lateinit var size: String
    private lateinit var trigger_price: String
    private lateinit var algo_price: String
    private lateinit var real_amount: String
    private lateinit var callback_rate: String
    private lateinit var algo_variance: String
    private lateinit var avg_amount: String
    private lateinit var price_limit: String
    private lateinit var deal_value: String
    private lateinit var sweep_range: String
    private lateinit var sweep_ratio: String
    private lateinit var single_limit: String
    private lateinit var time_interval: String


    open fun getInstrument_id(): String? {
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String?) {
        this.instrument_id = instrument_id!!
    }

    open fun getOrder_type(): String? {
        return order_type
    }

    open fun setOrder_type(order_type: String?) {
        this.order_type = order_type!!
    }

    open fun getTimestamp(): String? {
        return timestamp
    }

    open fun setTimestamp(timestamp: String?) {
        this.timestamp = timestamp!!
    }

    open fun getRejected_at(): String? {
        return rejected_at
    }

    open fun setRejected_at(rejected_at: String?) {
        this.rejected_at = rejected_at!!
    }

    open fun getAlgo_id(): String? {
        return algo_id
    }

    open fun setAlgo_id(algo_id: String?) {
        this.algo_id = algo_id!!
    }

    open fun getStatus(): String? {
        return status
    }

    open fun setStatus(status: String?) {
        this.status = status!!
    }

    open fun getType(): String? {
        return type
    }

    open fun setType(type: String?) {
        this.type = type!!
    }

    open fun getLeverage(): String? {
        return leverage
    }

    open fun setLeverage(leverage: String?) {
        this.leverage = leverage!!
    }

    open fun getSize(): String? {
        return size
    }

    open fun setSize(size: String?) {
        this.size = size!!
    }

    open fun getTrigger_price(): String? {
        return trigger_price
    }

    open fun setTrigger_price(trigger_price: String?) {
        this.trigger_price = trigger_price!!
    }

    open fun getAlgo_price(): String? {
        return algo_price
    }

    open fun setAlgo_price(algo_price: String?) {
        this.algo_price = algo_price!!
    }

    open fun getReal_amount(): String? {
        return real_amount
    }

    open fun setReal_amount(real_amount: String?) {
        this.real_amount = real_amount!!
    }

    open fun getCallback_rate(): String? {
        return callback_rate
    }

    open fun setCallback_rate(callback_rate: String?) {
        this.callback_rate = callback_rate!!
    }

    open fun getAlgo_variance(): String? {
        return algo_variance
    }

    open fun setAlgo_variance(algo_variance: String?) {
        this.algo_variance = algo_variance!!
    }

    open fun getAvg_amount(): String? {
        return avg_amount
    }

    open fun setAvg_amount(avg_amount: String?) {
        this.avg_amount = avg_amount!!
    }

    open fun getPrice_limit(): String? {
        return price_limit
    }

    open fun setPrice_limit(price_limit: String?) {
        this.price_limit = price_limit!!//얘는 무조건 null 안들어온다라는 의미 
    }

    open fun getDeal_value(): String? {
        return deal_value
    }

    open fun setDeal_value(deal_value: String?) {
        this.deal_value = deal_value!!
    }

    open fun getSweep_range(): String? {
        return sweep_range
    }

    open fun setSweep_range(sweep_range: String?) {
        this.sweep_range = sweep_range!!
    }

    open fun getSweep_ratio(): String? {
        return sweep_ratio
    }

    open fun setSweep_ratio(sweep_ratio: String?) {
        this.sweep_ratio = sweep_ratio!!
    }

    open fun getSingle_limit(): String? {
        return single_limit
    }

    open fun setSingle_limit(single_limit: String?) {
        this.single_limit = single_limit!!
    }

    open fun getTime_interval(): String? {
        return time_interval
    }

    open fun setTime_interval(time_interval: String?) {
        this.time_interval = time_interval!!
    }


}