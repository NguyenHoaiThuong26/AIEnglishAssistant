package com.englishcoach.english_coach_backend.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {
    @Id
    Long id;

    @Column(nullable = false, unique = true)
    String name;

    String description;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

}
