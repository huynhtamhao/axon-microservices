package com.springbank.user.query.handles;

import com.springbank.user.query.dto.UserLookupResponse;
import com.springbank.user.query.queries.FindAllUsersQuery;
import com.springbank.user.query.queries.FindUserByIdQuery;
import com.springbank.user.query.queries.SearchUsersQuery;

public interface UserQueryHandler {
    UserLookupResponse getUserById(FindUserByIdQuery query);
    UserLookupResponse searchUsers(SearchUsersQuery query);
    UserLookupResponse getAllUsers(FindAllUsersQuery query);
}
