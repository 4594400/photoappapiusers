package com.doc.photoapp.api.users.service;

import com.doc.photoapp.api.users.shared.UserDto;

public interface UsersService {
    UserDto createUser(UserDto userDetails);
}
