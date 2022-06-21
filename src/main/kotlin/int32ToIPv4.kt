// мое решение
//fun longToIP(ip: UInt): String = ip.toString(2).padStart(32, '0').chunked(8).map { c -> Integer.parseInt(c, 2) }.joinToString(".")

// решение чуть получше
//fun longToIP(ip: UInt): String { return ip.toString(radix = 2).padStart(32, '0').chunked(8).map { it.toInt(radix = 2) }.joinToString(".") }

// непонятное, но вроде как лучшее решение
fun longToIP(x: UInt) = (0..24 step 8).map { x shr it and 255u }.reversed().joinToString(".")
