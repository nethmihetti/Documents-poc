package com.document.RESTServer.model

import com.vladmihalcea.hibernate.type.json.JsonBinaryType
import com.vladmihalcea.hibernate.type.json.JsonStringType
import lombok.Data
import lombok.NoArgsConstructor
import org.hibernate.annotations.Type
import org.hibernate.annotations.TypeDef
import java.sql.Date
import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Data
@NoArgsConstructor
@TypeDef(name = "jsonb", typeClass = JsonBinaryType::class)
@Table(name="notice_documents", schema = "documents_v1")
data class Document (

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    @Column(name="data", columnDefinition = "jsonb")
    @Type(type = "jsonb")
    val data: JsonDocument,

    @Column(name="created_at")
    val createdAt: LocalDateTime? = LocalDateTime.now(),

    @Column(name="updated_at")
    val updatedAt: LocalDateTime? = LocalDateTime.now()

)

