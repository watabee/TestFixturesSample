package com.github.watabee.testfixturessample.testutils

import java.util.Calendar
import java.util.Date
import java.util.TimeZone

object TestUtils {

    fun createDate(
        year: Int,
        month: Int,
        day: Int,
        hour: Int = 0,
        minute: Int = 0,
        second: Int = 0,
        millisecond: Int = 0,
        timeZone: TimeZone = TimeZone.getDefault()
    ): Date {
        val calendar = Calendar.getInstance(timeZone)
        calendar.set(year, month - 1, day, hour, minute, second)
        calendar.set(Calendar.MILLISECOND, millisecond)
        return calendar.time
    }
}
