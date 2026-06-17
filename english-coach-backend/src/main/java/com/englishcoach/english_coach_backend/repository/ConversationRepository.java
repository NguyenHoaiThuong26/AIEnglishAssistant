package com.englishcoach.english_coach_backend.repository;

import com.englishcoach.english_coach_backend.entity.Conversation;
import com.englishcoach.english_coach_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {
}
