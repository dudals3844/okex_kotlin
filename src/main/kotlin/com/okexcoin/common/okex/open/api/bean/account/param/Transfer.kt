package com.okexcoin.common.okex.open.api.bean.account.param


open class Transfer{
    private lateinit var currency: String
    private lateinit var amount: String
    private lateinit var from: String
    private lateinit var to: String
    private lateinit var sub_account: String
    private lateinit var instrument_id: String
    private lateinit var to_instrument_id: String
    private lateinit var type: String

    fun setType(type: String) {
        this.type = type
    }

    fun getType(): String{
        return type
    }

    fun getTo_instrument_id(): String{
        return to_instrument_id
    }

    fun setTo_instrument_id(to_instrument_Id: String){
        this.to_instrument_id = to_instrument_Id
    }

    fun getAmount(): String{
        return amount
    }

    fun getFrom(): String{
        return from
    }

    fun getTo(): String{
        return to
    }

    fun getInstrument_id(): String{
        return instrument_id
    }


    fun setInstrument_id(instrument_id: String){
        this.instrument_id = instrument_id
    }


    fun setAmount(amount: String){
        this.amount = amount
    }

    fun setFrom(from: String){
        this.from = from
    }

    fun setTo(to: String){
        this.to = to
    }

    fun getCurrency(): String{
        return currency
    }

    fun setCurrency(currency: String){
        this.currency = currency
    }

    fun setSub_account(sub_account: String){
        this.sub_account = sub_account
    }

    fun getSub_account(): String{
        return sub_account
    }















}