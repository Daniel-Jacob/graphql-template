package com.graphql.kotlinexample

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Service

@Service
class AuthorService(val authorRepository: AuthorRepository) : GraphQLQueryResolver, GraphQLMutationResolver {
    fun getAuthors() = authorRepository.findAll()
    fun persistAuthors(author: Author) = authorRepository.save(author)
    fun updateAuthor(author: Author) = authorRepository.save(author)
    fun deleteAuthor(author: Author) = authorRepository.delete(author)
}