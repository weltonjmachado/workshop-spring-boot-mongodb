package com.machadocode.workshopmongo.services;

import com.machadocode.workshopmongo.domain.Post;
import com.machadocode.workshopmongo.domain.User;
import com.machadocode.workshopmongo.repository.PostRepository;
import com.machadocode.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> findAll() {
        return repo.findAll();
    }

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}