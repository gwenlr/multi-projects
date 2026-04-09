package org.sample.stringutils

import org.apache.commons.lang3.StringUtils


object Strings {
    fun concat(left: Any?, right: Any?): String {
        return strip(left) + " " + strip(right)
    }

    private fun strip(`val`: Any?): String? {
        return StringUtils.strip(`val`.toString())
    }
}
