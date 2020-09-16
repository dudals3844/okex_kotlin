package com.okexcoin.common.okex.open.api.bean.futures

open class CursorPageParams{

    private var before: Int? = null
    private var after: Int? = null
    private var limit: Int? = null

    open fun getBefore(): Int? {
        return before
    }

    open fun setBefore(before: Int) {
        this.before = before
    }

    open fun getAfter(): Int? {
        return after
    }

    open fun setAfter(after: Int) {
        this.after = after
    }

    open fun getLimit(): Int? {
        return limit
    }

    open fun setLimit(limit: Int) {
        this.limit = limit
    }

}