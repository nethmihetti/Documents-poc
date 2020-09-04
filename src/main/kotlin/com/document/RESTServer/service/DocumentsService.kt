package com.document.RESTServer.service

import com.document.RESTServer.model.Document
import org.springframework.data.domain.Page

interface DocumentsService {
    fun getAllDocuments(): List<Document>
}
