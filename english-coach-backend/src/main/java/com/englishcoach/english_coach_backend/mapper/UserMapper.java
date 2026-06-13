package com.englishcoach.english_coach_backend.mapper;

import com.englishcoach.english_coach_backend.dto.auth.RegisterRequest;
import com.englishcoach.english_coach_backend.dto.user.UpdateUserRequest;
import com.englishcoach.english_coach_backend.dto.user.UserResponse;
import com.englishcoach.english_coach_backend.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring", uses = RoleMapper.class)
public interface UserMapper {

    User toUser(RegisterRequest request);
    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUserFromRequest( @MappingTarget User user, UpdateUserRequest request);
}
