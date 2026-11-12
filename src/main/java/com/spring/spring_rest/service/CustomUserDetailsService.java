package com.spring.spring_rest.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.spring.spring_rest.repository.AuthUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

  private final AuthUserRepository authUserRepo;

  public CustomUserDetailsService(AuthUserRepository authUserRepo) {
    this.authUserRepo = authUserRepo;
  }

  public UserDetails loadUserByUsername(String theUsername) {
    Auth_User user = authUserRepo.findByUsername(theUsername)
      .orElseThrow(())
  }

}
