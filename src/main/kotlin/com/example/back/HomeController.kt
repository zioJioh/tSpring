package com.example.back

import org.springframework.web.bind.annotation.GetMapping
import software.amazon.awssdk.services.s3.S3Client

class HomeController(
    private val s3Client: S3Client
) {
    @GetMapping
    fun main(): String {
        return "hi"
    }

    @GetMapping("/buckets")
    fun buckets(): List<String> {
        return s3Client.listBuckets().buckets().map{
            it.name()
        }
    }
}