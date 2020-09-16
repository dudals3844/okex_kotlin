package com.okexcoin.common.okex.open.api.bean.futures.result

open class ServerTime{
    private var iso: String? = null
    private var epoch: String? = null

    open fun getIso(): String? {
        return iso
    }

    open fun setIso(iso: String?) {
        this.iso = iso
    }

    open fun getEpoch(): String? {
        return epoch
    }

    open fun setEpoch(epoch: String?) {
        this.epoch = epoch
    }

}