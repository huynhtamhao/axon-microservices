package com.springbank.user.api.cmd.security;

public interface PasswordEncoder {
    String hashPassword(String password);
}
