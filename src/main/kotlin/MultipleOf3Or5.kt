fun solution(number: Int): Int {
    return when {
        number < 0 -> 0
        else -> (3 until number).sumOf {
            when {
                it % 3 == 0 -> it
                it % 5 == 0 -> it
                else -> 0
            }
        }
    }

}