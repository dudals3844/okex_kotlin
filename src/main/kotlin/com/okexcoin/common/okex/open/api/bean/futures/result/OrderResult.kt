package com.okexcoin.common.okex.open.api.bean.futures.result

open class OrderResult{
    private var client_oid: String? = null
    private var order_id: String? = null
    private var result: Boolean = false
    private var error_code: String? = null
    private var error_message: String? = null


    open fun getClient_oid(): String? {
        return client_oid
    }

    open fun setClient_oid(client_oid: String?) {
        this.client_oid = client_oid
    }

    open fun getOrder_id(): String? {
        return order_id
    }

    open fun setOrder_id(order_id: String?) {
        this.order_id = order_id
    }

    open fun isResult(): Boolean {
        return result!!
    }

    open fun setResult(result: Boolean) {
        this.result = result
    }

    open fun getError_code(): String? {
        return error_code
    }

    open fun setError_code(error_code: String?) {
        this.error_code = error_code
    }

    open fun getError_messsage(): String? {
        return error_message
    }

    open fun setError_messsage(error_messsage: String?) {
        error_message = error_messsage
    }
}