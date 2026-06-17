package com.englishcoach.english_coach_backend.repository;

import com.englishcoach.english_coach_backend.entity.User;
import com.englishcoach.english_coach_backend.entity.Vocabulary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VocabularyRepository extends JpaRepository<Vocabulary, Long> {
}
