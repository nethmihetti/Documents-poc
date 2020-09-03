package com.document.RESTServer

import com.document.RESTServer.controller.SampleController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
class RestServerApplication

fun main(args: Array<String>) {
    runApplication<RestServerApplication>(*args)
}
