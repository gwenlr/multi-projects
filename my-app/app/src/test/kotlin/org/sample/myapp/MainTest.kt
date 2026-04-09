package org.sample.myapp

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


internal class MainTest {
    var strings: MutableList<String> = ArrayList()

    @BeforeEach
    fun beforeEach() {
        strings.add("hello")
        strings.add("world")
    }

    @Test
    fun printAnswer() {
        Assertions.assertThat(strings)
            .hasSize(2)
    }
}