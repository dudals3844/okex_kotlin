package com.okexcoin.common.okex.open.api.bean.account.result


import java.math.BigDecimal

open class Ledger{
    private lateinit var ledger_id: String
    private lateinit var currency: String
    private lateinit var balance: String
    private lateinit var amount: String
    private lateinit var fee: String
    private lateinit var typeName: String
    private lateinit var timestamp: String

    fun getLedger_id(): String{
        return ledger_id
    }

    fun setLedgerf_id(ledger_id: String){
        this.ledger_id = ledger_id
    }

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

    fun getAmount(): String{
        return amount
    }

    fun setAmount(amount: String){
        this.amount = amount
    }

    fun getFee(): String{
        return fee
    }

    fun setFee(fee: String){
        this.fee = fee
    }

    fun getTypeName(): String{
        return typeName
    }

    fun setTypeName(typeName: String){
        this.typeName = typeName
    }

    fun getTimeStamp(): String{
        return timestamp
    }

    fun setTimeStamp(timestamp: String){
        this.timestamp = timestamp
    }

    @Override
    override fun toString(): String{
        return "Ledger{" +
                "ledger_id='" + ledger_id + '\'' +
                ", currency='" + currency + '\'' +
                ", balance='" + balance + '\'' +
                ", amount='" + amount + '\'' +
                ", fee='" + fee + '\'' +
                ", typeName='" + typeName + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}'

    }
}