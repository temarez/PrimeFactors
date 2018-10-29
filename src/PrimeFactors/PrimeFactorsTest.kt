package PrimeFactors

import org.hamcrest.CoreMatchers.*
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class PrimeFactorsTest {
    @Test fun factors() {
        assertThat(factorsOf(1), `is`(emptyList()))
        assertThat(factorsOf(2), `is`(listOf(2)))
        assertThat(factorsOf(3), `is`(listOf(3)))
        assertThat(factorsOf(4), `is`(listOf(2, 2)))
    }

    private fun factorsOf(nn: Int): List<Int> {
        var n = nn
        val factors = mutableListOf<Int>()
        if (n>1) {
            if (n%2 == 0) {
                factors.add(2)
                n /= 2
            }
            factors.add(n)
        }
        return factors
    }
}