package com.document.RESTServer.service.impl

import com.document.RESTServer.dao.DocumentsRepository
import com.document.RESTServer.model.Document
import com.document.RESTServer.model.JsonDocument
import com.document.RESTServer.service.DocumentsService
import com.document.RESTServer.util.ServerUtil
import org.springframework.stereotype.Service
import java.sql.Date
import java.time.LocalDate
import java.time.LocalDateTime
import javax.transaction.Transactional

@Service("agentInsuranceService")
@Transactional
class DocumentsServiceImpl(private val documentsRepository: DocumentsRepository): DocumentsService {

    override fun getAllDocuments(): List<Document> {
        return documentsRepository.findAll();
    }

    override fun postDocument(doc: JsonDocument): Document {
        val doc: Document = Document(ServerUtil.generateRandomId(), doc, LocalDateTime.now(), LocalDateTime.now())
        return documentsRepository.save(doc);
    }

}
