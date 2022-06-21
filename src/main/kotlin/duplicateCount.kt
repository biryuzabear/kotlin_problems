// мое решение

//fun duplicateCount(text: String): Int {
//    return text.lowercase().associate { c -> Pair(first = c, second = text.lowercase().count { z -> c == z }) }
//        .count { (_, v) -> v > 1 }
//}

//Решение с сайта
fun duplicateCount(text: String) = text.groupBy(Char::lowercase).count { it.value.count() > 1 }