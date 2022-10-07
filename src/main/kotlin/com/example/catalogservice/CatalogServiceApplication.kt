package com.example.catalogservice

import org.modelmapper.ModelMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CatalogServiceApplication{
    @Bean
    fun modelMapper(): ModelMapper {
        return ModelMapper()
    }
}
@Bean
fun main(args: Array<String>) {
    runApplication<CatalogServiceApplication>(*args)
}



