package com.example.catalogservice.repository

import com.example.catalogservice.domain.Catalog
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository


interface CatalogRepository : JpaRepository<Catalog?, Long?> {
    fun findByProductId(productId: String?): Catalog?
}