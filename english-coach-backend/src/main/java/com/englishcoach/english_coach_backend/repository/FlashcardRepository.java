package com.englishcoach.english_coach_backend.repository;

import com.englishcoach.english_coach_backend.entity.Flashcard;
import com.englishcoach.english_coach_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashcardRepository extends JpaRepository<Flashcard, Long> {
}
