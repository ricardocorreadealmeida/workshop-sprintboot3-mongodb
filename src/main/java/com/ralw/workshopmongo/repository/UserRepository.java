package com.ralw.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ralw.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}
