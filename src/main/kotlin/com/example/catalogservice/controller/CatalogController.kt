package com.example.catalogservice.controller

import com.example.catalogservice.dto.CatalogResponse
import com.example.catalogservice.service.CatalogService
import org.springframework.core.env.Environment
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalog-service")
class CatalogController (
    var service: CatalogService,
    val env: Environment
) {
    @GetMapping("/health-check")
    fun status(): String? {
        return "It's Working in UserService" + env.getProperty("local.server.port")
    }

    @GetMapping("/catalogs")
    fun getCatalogs(): ResponseEntity<List<CatalogResponse>> {
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllInfo());
    }
}