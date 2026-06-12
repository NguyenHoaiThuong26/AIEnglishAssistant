package com.englishcoach.english_coach_backend.repository;

import com.englishcoach.english_coach_backend.entity.Message;
import com.englishcoach.english_coach_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
