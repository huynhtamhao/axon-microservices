package com.springbank.user.cmd.security;

public interface PasswordEncoder {
    String hashPassword(String password);
}
