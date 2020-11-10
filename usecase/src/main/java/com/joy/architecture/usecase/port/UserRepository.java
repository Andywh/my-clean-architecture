package com.joy.architecture.usecase.port;

import com.joy.architecture.domain.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public interface UserRepository {

    User create(User user);

    Optional<User> findById(String id);

    Optional<User> findByEmail(String email);

    List<User> findAllUsers();

}
