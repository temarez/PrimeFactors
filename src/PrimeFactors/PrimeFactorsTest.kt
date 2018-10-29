package PrimeFactors

import org.hamcrest.CoreMatchers.*
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class PrimeFactorsTest {
    @Test fun factors() {
        Assert.assertThat(factorsOf(1), `is`(emptyList()))
    }

    private fun factorsOf(n: Int): List<Int> {
        return emptyList()
    }
}