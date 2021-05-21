package com.springbank.user.api.query.handles;

import com.springbank.user.core.models.User;
import com.springbank.user.api.query.dto.UserLookupResponse;
import com.springbank.user.api.query.queries.FindAllUsersQuery;
import com.springbank.user.api.query.queries.FindUserByIdQuery;
import com.springbank.user.api.query.queries.SearchUsersQuery;
import com.springbank.user.api.query.repositories.UserRepository;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserQueryHandlerImpl implements UserQueryHandler {
    private final UserRepository userRepository;

    @Autowired
    public UserQueryHandlerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryHandler
    @Override
    public UserLookupResponse getUserById(FindUserByIdQuery query) {
//        var user = userRepository.findById(query.getId());
//        return user.isPresent() ? new UserLookupResponse(user.get()) : null;
//        return user.map(UserLookupResponse::new).orElse(null);
        Optional<User> user = userRepository.findById(query.getId());
        return new UserLookupResponse(user.orElse(null));

    }

    @QueryHandler
    @Override
    public UserLookupResponse searchUsers(SearchUsersQuery query) {
        var users = new ArrayList<>(userRepository.findByFilterRegex(query.getFilter()));
        return new UserLookupResponse(users);
    }

    @QueryHandler
    @Override
    public UserLookupResponse getAllUsers(FindAllUsersQuery query) {
        var users = new ArrayList<>(userRepository.findAll());
        return new UserLookupResponse(users);
    }
}
