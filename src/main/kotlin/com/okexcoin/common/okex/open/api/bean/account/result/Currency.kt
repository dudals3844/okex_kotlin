package com.okexcoin.common.okex.open.api.bean.account.result


import java.math.BigDecimal

open class Currency{
    private lateinit var currency: String
    private lateinit var name: String
    private var can_withdraw: Int? = null
    private var can_deposit: Int? = null
    private var min_withdrawal: BigDecimal? = null

    fun getCurrency(): String{
        return currency
    }

    fun setCurrency(currency: String){
        this.currency = currency
    }

    fun getName(): String{
        return name
    }

    fun setName(name: String){
        this.name = name
    }

    fun getCan_withdraw(): Int?{
        return can_withdraw
    }

    fun setCan_withdraw(can_withdraw: Int){
        this.can_withdraw = can_withdraw
    }

    fun getCan_deposit(): Int?{
        return can_deposit
    }

    fun setCan_deposit(can_deposit: Int){
        this.can_deposit = can_deposit
    }

    fun getMin_withdrawal(): BigDecimal?{
        return min_withdrawal
    }

    fun setMin_withdrawal(min_withdrawal: BigDecimal){
        this.min_withdrawal = min_withdrawal
    }
}