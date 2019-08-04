package com.nmc.kotlin.web.basic.web.rest

import org.slf4j.LoggerFactory
import org.springframework.context.MessageSource
import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/api")
class InternationalizationResource(
    private val messageSource: MessageSource
) {

    private val log = LoggerFactory.getLogger(InternationalizationResource::class.java)



    @GetMapping("/greeting")
    fun getGreetingInternationlizationMessage(@RequestParam(name="language", required = false) language: String?): String {

        return when (LocalDateTime.now().hour) {
            in 0..11 -> messageSource.getMessage("message.morning", null, LocaleContextHolder.getLocale())
            in 12..15 -> messageSource.getMessage("message.afternoon", null, LocaleContextHolder.getLocale())
            in 16..22 -> messageSource.getMessage("message.evening", null, LocaleContextHolder.getLocale())
            else -> messageSource.getMessage("message.night", null, LocaleContextHolder.getLocale())
        }

    }
}
