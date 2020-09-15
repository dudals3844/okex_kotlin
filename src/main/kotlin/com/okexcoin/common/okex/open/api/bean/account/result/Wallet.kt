package com.okexcoin.common.okex.open.api.bean.account.result

open class Wallet{
    private lateinit var currency: String
    private lateinit var balance: String
    private lateinit var hold: String
    private lateinit var available: String

    fun getCurrency(): String{
        return currency
    }

    fun setCurrency(currency: String){
        this.currency = currency
    }

    fun getBalance(): String{
        return balance
    }

    fun setBalance(balance: String){
        this.balance = balance
    }

    fun getHold(): String{
        return hold
    }

    fun setHold(hold: String){
        this.hold = hold
    }

    fun getAvailable(): String{
        return available
    }

    fun setAvailable(available: String){
        this.available = available
    }
}