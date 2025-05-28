package com.ApiDioProjeto.apiDio.service;

import com.ApiDioProjeto.apiDio.model.User;
import com.ApiDioProjeto.apiDio.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(repository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("numero de conta  já existe");
        }
        return repository.save(user);
    }
}
