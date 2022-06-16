//object EnoughIsEnough {
//    fun deleteNth(elements:IntArray, maxOccurrences:Int):IntArray {
//        val list: MutableList<Int> = mutableListOf()
//        val map: MutableMap<Int, Int> = mutableMapOf()
//        if (maxOccurrences == 0)
//            return emptyList<Int>().toIntArray()
//        for (element in elements){
//            if (map.containsKey(element)){
//                if(map[element]!! >= maxOccurrences){
//                    continue
//                } else{
//                    list.add(element)
//                    map[element] = map[element]!! + 1;
//                }
//            } else {
//                map[element] = 1
//                list.add(element)
//            }
//        }
//        return list.toIntArray()
//    }
//}

// Решение с сайта
object EnoughIsEnough {
    fun deleteNth(elements:IntArray, maxOccurrences:Int):IntArray {
        val count = mutableMapOf<Int, Int>()

        return elements
            .asSequence()
            .onEach { count[it] = count.getOrDefault(it, 0) + 1 }
            .filter { count[it]!! <= maxOccurrences }
            .toList().toIntArray()
    }
}
