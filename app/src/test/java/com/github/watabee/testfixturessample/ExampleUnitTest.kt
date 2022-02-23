package com.github.watabee.testfixturessample

import com.github.watabee.testfixturessample.data.Simpsons
import com.github.watabee.testfixturessample.testutils.TestUtils
import org.junit.Assert.assertEquals
import org.junit.Test
import java.util.TimeZone

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test_date() {
        val date = TestUtils.createDate(2022, 1, 1, timeZone = TimeZone.getTimeZone("Asia/Tokyo")).time
        assertEquals(1640962800000L, date)
    }

    @Test
    fun test_homer() {
        val homer = Simpsons.HOMER
        assertEquals("Homer", homer.firstName)
        assertEquals("Simpson", homer.lastName)
    }
}