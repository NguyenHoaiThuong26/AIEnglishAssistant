package com.englishcoach.english_coach_backend.dto.user;

import com.englishcoach.english_coach_backend.dto.auth.RoleResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    Long id;

    String username;

    String email;

    String firstName;

    String lastName;

    boolean isActive;

    Set<RoleResponse> roles;
}
