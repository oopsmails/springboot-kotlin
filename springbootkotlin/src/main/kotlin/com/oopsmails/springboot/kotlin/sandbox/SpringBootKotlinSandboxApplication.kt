package com.oopsmails.springboot.kotlin.sandbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinSandboxApplication

fun main(args: Array<String>) {
    runApplication<SpringBootKotlinSandboxApplication>(*args)
}
