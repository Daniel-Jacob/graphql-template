package com.graphql.kotlinexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import java.sql.ResultSet

@SpringBootApplication
class KotlinExampleApplication

fun main(args: Array<String>) {
    runApplication<KotlinExampleApplication>(*args)
}
