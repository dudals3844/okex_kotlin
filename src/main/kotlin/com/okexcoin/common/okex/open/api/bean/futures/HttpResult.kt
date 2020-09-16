package com.okexcoin.common.okex.open.api.bean.futures

open class HttpResult{
    private var code = 0
    private var message: String? = null
    private var errorCode = 0
    private var errorMessage: String? = null
    private var order_id: String? = null
    private var result: Boolean? = null


    open fun getErrorCode(): Int {
        return errorCode
    }

    open fun setErrorCode(errorCode: Int) {
        this.errorCode = errorCode
    }

    open fun getErrorMessage(): String? {
        return errorMessage
    }

    open fun setErrorMessage(errorMessage: String?) {
        this.errorMessage = errorMessage
    }


    open fun getCode(): Int {
        return code
    }

    open fun setCode(code: Int) {
        this.code = code
    }

    open fun getMessage(): String? {
        return message
    }

    open fun setMessage(message: String?) {
        this.message = message
    }

    open fun getOrder_id(): String? {
        return order_id
    }

    open fun setOrder_id(order_id: String?) {
        this.order_id = order_id
    }

    open fun getResult(): Boolean? {
        return result
    }

    open fun setResult(result: Boolean?) {
        this.result = result
    }


    override fun toString(): String {
        return "\t\tResponse Body:{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", order_id='" + order_id + '\'' +
                ", result=" + result +
                '}'
    }
}