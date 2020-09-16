package com.okexcoin.common.okex.open.api.bean.futures.result

class FuturesOrderResult {
    private var result: String? = null
    private var instrument_id: String? = null
    private var order_type: String? = null
    private var algo_id: String? = null
    private var error_code: String? = null
    private var error_message: String? = null

    open fun getResult(): String? {
        return result
    }

    open fun setResult(result: String?) {
        this.result = result
    }

    open fun getInstrument_id(): String? {
        return instrument_id
    }

    open fun setInstrument_id(instrument_id: String?) {
        this.instrument_id = instrument_id
    }

    open fun getOrder_type(): String? {
        return order_type
    }

    open fun setOrder_type(order_type: String?) {
        this.order_type = order_type
    }

    open fun getAlgo_id(): String? {
        return algo_id
    }

    open fun setAlgo_id(algo_id: String?) {
        this.algo_id = algo_id
    }

    open fun getError_code(): String? {
        return error_code
    }

    open fun setError_code(error_code: String?) {
        this.error_code = error_code
    }

    open fun getError_message(): String? {
        return error_message
    }

    open fun setError_message(error_message: String?) {
        this.error_message = error_message
    }
}