package com.document.RESTServer.dao

import com.document.RESTServer.model.Document
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
interface DocumentsRepository : JpaRepository<Document, Long> {

   // @Transactional
    //fun findByInsuranceuserUsername(@Param("username") username: String): Document
}
