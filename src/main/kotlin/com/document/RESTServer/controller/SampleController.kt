package com.document.RESTServer.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/V1")
@CrossOrigin
class SampleController{

    @GetMapping("/hello-world")
    fun getSampleResponse(): String {
        return "Hello World"
    }
}
