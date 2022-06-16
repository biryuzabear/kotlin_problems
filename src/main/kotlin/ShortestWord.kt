import java.util.Collections.min
// Мое решение
// fun findShort(s: String): Int = s.split(" ").sortedWith(compareBy{it.length})[0].length
// Решение с сайта
fun findShort(s: String): Int = s.split(" ").minOf{it.length}
