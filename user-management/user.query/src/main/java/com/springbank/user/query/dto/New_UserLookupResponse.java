package com.springbank.user.query.dto;

import com.springbank.user.core.dto.BaseResponse;
import com.springbank.user.core.models.User;

import java.util.ArrayList;
import java.util.List;

public class New_UserLookupResponse extends BaseResponse {
    private List<User> users;

    public New_UserLookupResponse(String message) {
        super(message);
    }

    public New_UserLookupResponse(List<User> users) {
        super(null);
        this.users = users;
    }

    public New_UserLookupResponse(String message, User user) {
        super(message);
        this.users = new ArrayList<>();
        this.users.add(user);
    }

    public New_UserLookupResponse(User user) {
        super(null);
        this.users = new ArrayList<>();
        this.users.add(user);
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
