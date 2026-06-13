package com.englishcoach.english_coach_backend.service;

import com.englishcoach.english_coach_backend.dto.auth.RegisterRequest;
import com.englishcoach.english_coach_backend.dto.user.UserResponse;
import com.englishcoach.english_coach_backend.entity.Role;
import com.englishcoach.english_coach_backend.entity.User;
import com.englishcoach.english_coach_backend.mapper.UserMapper;
import com.englishcoach.english_coach_backend.repository.RoleRepository;
import com.englishcoach.english_coach_backend.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserService {
    private static final String DEFAULT_ROLE_NAME = "USER";

    UserRepository userRepository;
    RoleRepository roleRepository;
    UserMapper userMapper;
    PasswordEncoder passwordEncoder;

    @Transactional
    public UserResponse createUser(RegisterRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new IllegalArgumentException("Username already exists");
        }

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }

        Role defaultRole = roleRepository.findByName(DEFAULT_ROLE_NAME)
                .orElseThrow(() -> new IllegalStateException("Default role not found: " + DEFAULT_ROLE_NAME));

        HashSet<Role> roles = new HashSet<>();
        User user = userMapper.toUser(request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setActive(true);
        user.setRoles(roles);

        User savedUser = userRepository.save(user);
        log.info("Created user with id: {}", savedUser.getId());

        return userMapper.toUserResponse(savedUser);
    }
}
