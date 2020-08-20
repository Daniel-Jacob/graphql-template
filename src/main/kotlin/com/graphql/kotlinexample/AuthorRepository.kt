package com.graphql.kotlinexample

import org.springframework.data.repository.CrudRepository

interface AuthorRepository : CrudRepository<Author, Long>