package com.nmc.kotlin.web.basic.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor
import org.springframework.web.servlet.i18n.SessionLocaleResolver
import java.util.*

@Configuration
class LocaleConfiguration : WebMvcConfigurer {

    @Value("\${application.i18n.defaultLang}")
    private val defaultLang: String? = "th"

    @Bean(name = ["localeResolver"])
    fun localeResolver(): LocaleResolver {
//        val cookieLocaleResolver = AngularCookieLocaleResolver()
//        cookieLocaleResolver.cookieName = "NG_TRANSLATE_LANG_KEY"

        val sessionLocaleResolver = SessionLocaleResolver()
        sessionLocaleResolver.setDefaultLocale(Locale(defaultLang))

        return sessionLocaleResolver
    }

    override fun addInterceptors(registry: InterceptorRegistry?) {
        val localeChangeInterceptor = LocaleChangeInterceptor()
        localeChangeInterceptor.paramName = "language"
        registry!!.addInterceptor(localeChangeInterceptor)
    }
}
