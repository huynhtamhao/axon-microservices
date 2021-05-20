package com.springbank.user.api.query.handles;

import com.springbank.user.api.query.dto.UserLookupResponse;
import com.springbank.user.api.query.queries.FindAllUsersQuery;
import com.springbank.user.api.query.queries.FindUserByIdQuery;
import com.springbank.user.api.query.queries.SearchUsersQuery;

public interface UserQueryHandler {
    UserLookupResponse getUserById(FindUserByIdQuery query);

    UserLookupResponse searchUsers(SearchUsersQuery query);

    UserLookupResponse getAllUsers(FindAllUsersQuery query);
}
