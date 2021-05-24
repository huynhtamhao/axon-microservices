package com.springbank.user.cmd.security;

public interface CommandPasswordEncoder {
    String hashPassword(String password);
}
