package com.document.RESTServer.service

import com.document.RESTServer.model.Document
import com.document.RESTServer.model.JsonDocument
import org.springframework.data.domain.Page

interface DocumentsService {
    fun getAllDocuments(): List<Document>
    fun postDocument(doc: JsonDocument): Document
}
