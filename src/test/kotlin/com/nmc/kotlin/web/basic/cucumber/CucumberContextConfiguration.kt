package com.nmc.kotlin.web.basic.cucumber

import com.nmc.kotlin.web.basic.KotlinWebBasicApp
import cucumber.api.java.Before
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration

@SpringBootTest
@WebAppConfiguration
@ContextConfiguration(classes = [KotlinWebBasicApp::class])
class CucumberContextConfiguration {

    @Before
    fun setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }
}
