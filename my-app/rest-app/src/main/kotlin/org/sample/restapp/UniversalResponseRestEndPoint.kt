package org.sample.restapp

import org.sample.numberutils.Numbers.add
import org.sample.stringutils.Strings.concat
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/universal")
class UniversalResponseRestEndPoint {
    @get:GetMapping(produces = [MediaType.TEXT_PLAIN_VALUE])
    val universalResponse: String
        get() = concat(" The answer is ", add(19, 23))
}
