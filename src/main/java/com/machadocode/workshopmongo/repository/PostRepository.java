package com.machadocode.workshopmongo.repository;

import com.machadocode.workshopmongo.domain.Post;
import com.machadocode.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}