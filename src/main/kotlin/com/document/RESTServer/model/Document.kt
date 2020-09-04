package com.document.RESTServer.model

import com.vladmihalcea.hibernate.type.json.JsonBinaryType
import com.vladmihalcea.hibernate.type.json.JsonStringType
import lombok.Data
import lombok.NoArgsConstructor
import org.hibernate.annotations.Type
import org.hibernate.annotations.TypeDef
import java.sql.Date
import javax.persistence.*


@Entity
@Data
@NoArgsConstructor
@TypeDef(name = "jsonb", typeClass = JsonBinaryType::class)
@Table(name="notice_documents", schema = "documents_v1")
data class Document (

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(name="data")
    @Type(type = "jsonb")
    var data: JsonDocument,

    @Column(name="created_at")
    var created_at: Date,

    @Column(name="updated_at")
    var updated_at: Date

)

