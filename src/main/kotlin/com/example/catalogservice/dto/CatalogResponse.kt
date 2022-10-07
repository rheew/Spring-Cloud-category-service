package com.example.catalogservice.dto

import com.fasterxml.jackson.annotation.JsonInclude
import java.time.LocalDate


@JsonInclude(JsonInclude.Include.NON_NULL)
class CatalogResponse {
    var productId: String? = null
    var productName: String? = null
    var unitPrice: Int? = null
    var stock: Int? = null
    var createdAt: LocalDate? = null
}