package com.document.RESTServer.controller

import com.document.RESTServer.model.Document
import com.document.RESTServer.service.DocumentsService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/V1/documents")
@CrossOrigin
class DocumentsController(private val documentsService: DocumentsService){

    @GetMapping()
    fun getAllDocuments(): List<Document> {
        return documentsService.getAllDocuments();
    }

    @GetMapping(":id")
    fun getOneDocument(): List<Document> {
        return documentsService.getAllDocuments();
    }

    @PostMapping()
    fun postNewDocument(): String {
        return "OK"
    }

    @PatchMapping(":id")
    fun patchMapping(): String {
        return "OK"
    }

    @DeleteMapping(":id")
    fun deleteMapping(): String {
        return "OK"
    }
}
