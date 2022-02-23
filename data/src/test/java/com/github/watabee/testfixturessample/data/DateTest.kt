package com.github.watabee.testfixturessample.data

import com.github.watabee.testfixturessample.testutils.TestUtils
import org.junit.Assert
import org.junit.Test
import java.util.TimeZone

class DateTest {

    @Test
    fun test() {
        val date = TestUtils.createDate(2021, 12, 31, timeZone = TimeZone.getTimeZone("Asia/Tokyo")).time
        Assert.assertEquals(date, 1640876400000L)
    }
}
