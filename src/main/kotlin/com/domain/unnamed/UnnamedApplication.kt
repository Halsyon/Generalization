package com.domain.unnamed

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.ImportResource


@ImportResource("/integration/integration.xml")
@SpringBootApplication
class UnnamedApplication

fun main(args: Array<String>) {
    runApplication<UnnamedApplication>(*args) {
        val ctx: ConfigurableApplicationContext =
            SpringApplication(UnnamedApplication::class.java).run(*args)
        println("Hit Enter to terminate")
        System.`in`.read()
        ctx.close()
    }
}
