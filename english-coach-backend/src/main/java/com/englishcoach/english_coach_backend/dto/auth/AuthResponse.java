package com.englishcoach.english_coach_backend.dto.auth;

import com.englishcoach.english_coach_backend.dto.user.UserResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthResponse {

    String accessToken;
    Long expiresIn;
    UserResponse user;

}
