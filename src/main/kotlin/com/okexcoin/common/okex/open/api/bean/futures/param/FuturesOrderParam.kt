package com.okexcoin.common.okex.open.api.bean.futures.param



open class FuturesOrderParam{
    private lateinit var instrument_id: String
    private lateinit var type: String
    private lateinit var order_type: String
    private lateinit var size: String
    private lateinit var trigger_price: String
    private lateinit var algo_price: String
    private lateinit var algo_type: String
    private lateinit var callback_rate: String
    private lateinit var algo_variance: String
    private lateinit var avg_amount: String
    private lateinit var price_limit: String
    private lateinit var sweep_range: String
    private lateinit var sweep_ratio: String
    private lateinit var single_limit: String
    private lateinit var time_interval: String

    fun getAlgo_type(): String{
        return algo_type
    }

    fun setAlgo_type(algo_type: String){
        this.algo_type = algo_type
    }

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    fun getType(): String{
        return type
    }

    fun setType(type: String){
        this.type = type
    }

    fun getOrder_type(): String{
        return order_type
    }

    fun setOrder_type(order_type: String){
        this.order_type = order_type
    }

    fun getSize(): String{
        return size
    }

    fun setSize(size: String){
        this.size = size
    }

    fun getTrigger_price(): String{
        return trigger_price
    }

    fun setTrigger_price(trigger_price: String){
        this.trigger_price = trigger_price
    }

    fun getAlgo_price(): String{
        return algo_price
    }

    fun setAlgo_price(algo_price: String){
        this.algo_price = algo_price
    }

    fun getCallback_rate(): String{
        return callback_rate
    }

    fun setCallback_rate(callback_rate: String){
        this.callback_rate = callback_rate
    }

    fun getAlgo_variance(): String{
        return algo_variance
    }

    fun setAlgo_variance(algo_variance: String){
        this.algo_variance = algo_variance
    }

    fun getAvg_amount(): String{
        return avg_amount
    }

    fun setAvg_amount(avg_amount: String){
        this.avg_amount = avg_amount
    }

    fun getPrice_limit(): String{
        return price_limit
    }

    fun setPrice_limit(price_limit: String){
        this.price_limit = price_limit
    }

    fun getSweep_range(): String{
        return sweep_range
    }

    fun setSweep_range(sweep_range: String){
        this.sweep_range = sweep_range
    }

    fun getSweep_ratio(): String{
        return sweep_ratio
    }

    fun setSweep_ratio(sweep_ratio: String){
        this.sweep_ratio = sweep_ratio
    }

    fun getSingle_limit(): String{
        return single_limit
    }

    fun setSingle_limit(single_limit: String){
        this.single_limit = single_limit
    }

    fun getTime_interval(): String{
        return time_interval
    }

    fun setTime_interval(time_interval: String){
        this.time_interval = time_interval
    }
}