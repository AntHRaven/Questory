package com.example.questory.repo;

import com.example.questory.domain.Quest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRepo extends JpaRepository<Quest, Long> {
}
