package com.yagoar.springbootreactnative.user;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(final User user);

    User updateUser(User user);

    void deleteUser(Long userId);

    Optional<User> findByUsername(String username);

    List<User> findAllUsers();

    Long numberOfUsers();
}
