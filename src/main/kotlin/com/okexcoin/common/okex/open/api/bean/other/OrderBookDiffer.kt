package com.okexcoin.common.okex.open.api.bean.other

//import java.util.*


open class OrderBookDiffer{
    open fun <T : OrderBookItem<T>> diff(current: List<T>, snapshot: List<T>,
                                       comparator: Comparator<String?>?, order: Int): List<T>? {

        val snapshotIter: Iterator<T> = snapshot.iterator()
        val currentIter: Iterator<T> = current.iterator()
        val diff: MutableList<T> = ArrayList(current.size)
        if (snapshotIter.hasNext() && currentIter.hasNext()) {
            var snapshotBookItem: T = snapshotIter.next()
            var currentBookItem: T = currentIter.next()
            /*System.out.println("snapshotBookItem===================="+snapshotBookItem);
            System.out.println("currentBookItem======================="+currentBookItem);
            System.out.println("snapshotBookItem.getPrice()===================="+snapshotBookItem.getPrice());
            System.out.println("currentBookItem.getPrice()======================="+currentBookItem.getPrice());*/while (true) {

//                final int compare = comparator.compare(snapshotBookItem.getPrice(), currentBookItem.getPrice());
                val currentPrc: Double = currentBookItem.getPrice().toDouble()
                val snapPrc: Double = snapshotBookItem.getPrice().toDouble()
                var compare = 0
                if (order == 1 && snapPrc > currentPrc || order == 2 && snapPrc < currentPrc) //增>全
                    compare = 1 else if (order == 1 && snapPrc < currentPrc || order == 2 && snapPrc > currentPrc) //增<全
                    compare = -1

                //价格相等时候
                if (compare == 0) {
                    if (!snapshotBookItem!!.equals(currentBookItem)) {
                        if ("0" != snapshotBookItem.getSize().toString()) {
                            diff.add(snapshotBookItem)
                        }
                    }
                    if (currentIter.hasNext() && snapshotIter.hasNext()) {
                        currentBookItem = currentIter.next()
                        snapshotBookItem = snapshotIter.next()
                    } else {
                        break
                    }
                    //增量价格小于全量的
                } else if (compare < 0) {
                    if ("0" != snapshotBookItem.getSize().toString()) {
                        diff.add(snapshotBookItem)
                    }
                    snapshotBookItem = if (snapshotIter.hasNext()) {
                        snapshotIter.next()
                    } else {
                        diff.add(currentBookItem)
                        break
                    }
                } else {
                    diff.add(currentBookItem)
                    currentBookItem = if (currentIter.hasNext()) {
                        currentIter.next()
                    } else {
                        if ("0" != snapshotBookItem.getSize().toString()) {
                            diff.add(snapshotBookItem)
                        }
                        break
                    }
                }
            }
        }
        if (!snapshotIter.hasNext()) {
            currentIter.forEachRemaining { e: T -> diff.add(e) }
        }
        if (!currentIter.hasNext()) {
//            snapshotIter.forEachRemaining(remain -> diff.add(emptyItemFunction.apply(remain.getPrice())));
            snapshotIter.forEachRemaining { e: T -> diff.add(e) }
        }
        //返回不可修改的diff
        return Collections.unmodifiableList(diff)
    }

}