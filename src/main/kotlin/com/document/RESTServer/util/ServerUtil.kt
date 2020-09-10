package com.document.RESTServer.util

import java.util.*
import java.lang.Long.MAX_VALUE

object ServerUtil {
    fun generateRandomId(): Long{
        return UUID.randomUUID().mostSignificantBits and MAX_VALUE
    }
}
