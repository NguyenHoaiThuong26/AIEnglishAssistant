package com.englishcoach.english_coach_backend.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateUserRequest {

    @Size(min = 3, message = "Username must be at least 3 characters")
    String username;

    @Email(message = "Email must be valid")
    @Size(max = 255, message = "Email must not exceed 255 characters")
    String email;

    @Size(min = 8, max = 255, message = "Password must be between 8 and 255 characters")
    String password;

    String firstName;

    String lastName;
}
