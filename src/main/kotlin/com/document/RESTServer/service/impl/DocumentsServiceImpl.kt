package com.document.RESTServer.service.impl

import com.document.RESTServer.dao.DocumentsRepository
import com.document.RESTServer.model.Document
import com.document.RESTServer.service.DocumentsService
import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service("agentInsuranceService")
@Transactional
class DocumentsServiceImpl(private val documentsRepository: DocumentsRepository): DocumentsService {

    override fun getAllDocuments(): List<Document> {
        return documentsRepository.findAll();
    }

}
