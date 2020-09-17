package com.okexcoin.common.okex.open.api.bean.other


open interface OrderBookItem<T> {
    fun getPrice(): String?
    fun getSize(): T
}
