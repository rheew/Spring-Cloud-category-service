package com.example.catalogservice.service

import com.example.catalogservice.dto.CatalogResponse
import com.example.catalogservice.repository.CatalogRepository
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class CatalogService(
    val catalogRepository: CatalogRepository,
    val mapper: ModelMapper
) {

    fun getAllInfo(): List<CatalogResponse>? {
        return catalogRepository.findAll().stream()
            .map { catalog ->
                mapper.map(catalog, CatalogResponse::class.java) }
            .collect(Collectors.toList())
    }
}