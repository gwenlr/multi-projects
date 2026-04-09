package org.sample.restapp

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.test.web.servlet.client.RestTestClient
import org.springframework.test.web.servlet.client.expectBody


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureRestTestClient
internal class UniversalResponseRestEndPointTest {
    @LocalServerPort
    private val port = 0

    @Autowired
    private val client: RestTestClient? = null

    @Test
    fun getUniversalResponse() {
        client!!.get()
            .uri("http://localhost:$port/universal")
            .exchange()
            .expectStatus().isOk()
            .expectBody<String>()
            .isEqualTo("The answer is 42")
    }
}