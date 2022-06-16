//fun toCamelCase(str: String): String {
//val ch = str.toCharArray()
//    for (i in ch.indices) {
//        if(i!= 0 && ch[i-1].toString().matches("[_-]".toRegex()))
//            ch[i] = ch[i].uppercaseChar()
//    }
//    return String(ch).replace("[_-]".toRegex(),"")
//}

// Решения лучше

fun toCamelCase(str: String) =
    str.split('-', '_').mapIndexed { i, it -> if (i != 0) it.capitalize() else it }.joinToString("")