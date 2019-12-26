
package com.test.geeksdata.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.test.geeksdata.springsecurity.entity.User;
import com.test.geeksdata.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
