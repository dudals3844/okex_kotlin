package com.okexcoin.common.okex.open.api.bean.account.param

import java.math.BigDecimal

open class Withdraw{
    private lateinit var amount: String
    private lateinit var currency: String
    private lateinit var destination: String
    private lateinit var to_address: String
    private lateinit var trade_pwd: String
    private lateinit var fee: String
    private lateinit var tag: String

    fun getAmount(): String{
        return amount
    }


    fun setAmount(amount: String){
        this.amount = amount
    }

    fun getDestination(): String{
        return destination
    }

    fun setDestination(destination: String){
        this.destination = destination
    }

    fun getFee(): String{
        return fee
    }

    fun setFee(fee: String){
        this.fee = fee
    }

    fun getCurrency(): String{
        return currency
    }

    fun setCurrency(currency: String){
        this.currency = currency
    }

    fun getTrade_pwd(): String{
        return trade_pwd
    }

    fun setTrade_pwd(trade_pwd: String){
        this.trade_pwd = trade_pwd
    }

    fun getTo_address(): String{
        return to_address
    }

    fun setTo_address(to_address: String){
        this.to_address = to_address
    }

    fun getTag(): String{
        return tag
    }

    fun setTag(tag: String){
        this.tag = tag
    }
}