package me.elbia.service;


import me.elbia.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
