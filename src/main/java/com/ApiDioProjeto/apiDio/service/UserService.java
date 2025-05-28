package com.ApiDioProjeto.apiDio.service;

import com.ApiDioProjeto.apiDio.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);
}
