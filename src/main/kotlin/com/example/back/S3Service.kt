package com.example.back

interface S3Service {
    fun getBucketNames() : List<String>
}