package com.okexcoin.common.okex.open.api.bean.futures.result


open class CancleFuturesOrder{
    private lateinit var instrument_id: String
    private lateinit var algo_ids: List<String>
    private lateinit var order_type: String
    private lateinit var error_code: String
    private lateinit var error_message: String

    fun getError_code(): String{
        return error_code
    }

    fun setError_code(error_code: String){
        this.error_code = error_code
    }

    fun getError_message(): String{
        return error_message
    }

    fun setError_message(error_message: String){
        this.error_message = error_message
    }

    fun getInstrument_id(): String{
        return instrument_id
    }

    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }

    fun getAlgo_ids(): List<String>{
        return algo_ids
    }

    fun setAlgo_ids(algo_ids: List<String>){
        this.algo_ids = algo_ids
    }

    fun getOrder_type(): String{
        return order_type
    }

    fun setOrder_type(order_type: String){
        this.order_type = order_type
    }

    @Override
    override fun toString(): String{
        return "CancelFuturesOrder{" +
                "instrument_id='" + instrument_id + '\'' +
                ", algo_ids=" + algo_ids +
                ", order_type='" + order_type + '\'' +
                ", error_code='" + error_code + '\'' +
                ", error_message='" + error_message + '\'' +
                '}'
    }


}