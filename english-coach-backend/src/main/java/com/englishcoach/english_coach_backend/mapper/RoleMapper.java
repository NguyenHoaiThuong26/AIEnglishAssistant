package com.englishcoach.english_coach_backend.mapper;

import com.englishcoach.english_coach_backend.dto.auth.RoleRequest;
import com.englishcoach.english_coach_backend.dto.auth.RoleResponse;
import com.englishcoach.english_coach_backend.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "users", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);

}
