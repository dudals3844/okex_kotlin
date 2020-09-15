package com.okexcoin.common.okex.open.api.bean.account.result

import java.math.BigDecimal
import kotlin.math.max


open class WithdrawFee{
    private lateinit var min_fee: BigDecimal
    private lateinit var max_fee: BigDecimal
    private lateinit var currency: String

    fun getMin_fee(): BigDecimal{
        return min_fee
    }

    fun setMin_fee(min_fee: BigDecimal){
        this.min_fee = min_fee
    }

    fun getMax_fee(): BigDecimal{
        return max_fee
    }

    fun setMax_fee(max_fee: BigDecimal){
        this.max_fee = max_fee
    }

    fun getCurrency(): String{
        return currency
    }

    fun setCurrency(currency: String){
        this.currency = currency
    }

    @Override
    override fun toString(): String{
        return "WithdrawFee{" +
                "min_fee=" + min_fee +
                ", max_fee=" + max_fee +
                ", currency='" + currency + '\'' +
                '}'
    }
}