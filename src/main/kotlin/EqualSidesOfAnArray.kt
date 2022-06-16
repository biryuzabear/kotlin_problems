// Первое решение
//object EqualSidesOfAnArray {
//    fun findEvenIndex(arr: IntArray): Int {
//        for (index in arr.indices) {
//            if (arr.copyOfRange(0, index).sum() == arr.copyOfRange(index + 1, arr.size).sum())
//                return index
//        }
//        return -1
//    }
//}

// Второе решение
//object EqualSidesOfAnArray {
//    fun findEvenIndex(arr: IntArray): Int =
//        arr.indices.find { i -> arr.copyOfRange(0, i).sum() == arr.copyOfRange(i + 1, arr.size).sum() } ?: -1
//}

// Интересное решение с сайта, хотя пишут что не эффективное
//object EqualSidesOfAnArray {
//    fun findEvenIndex(arr: IntArray) = arr.indices.indexOfFirst { arr.take(it).sum() == arr.drop(it + 1).sum() }
//}

// Вот это вроде обещает быть самым быстрым решением и эффективным по памяти, так как здесь не создаются никакие дополнительные массивы
object EqualSidesOfAnArray {
    fun findEvenIndex(arr: IntArray): Int {
        if (arr.isEmpty()) return 0
        val sumTotal = arr.sum()
        arr.foldIndexed(0) { index, sumLeft, value ->
            if (sumLeft * 2 + value == sumTotal) return index
            sumLeft + value
        }
        return -1
    }

}