import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ShortestWordKtTest {
    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
        assertEquals(2, findShort("Let's travel abroad shall we"))
    }
}
