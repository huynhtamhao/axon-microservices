package com.springbank.user.api.cmd.security;

public interface CommandPasswordEncoder {
    String hashPassword(String password);
}
