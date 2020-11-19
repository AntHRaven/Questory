package com.example.questory.controller;

import com.example.questory.domain.Quest;
import com.example.questory.repo.QuestRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class QuestController {

    private final QuestRepo questRepo;

    public QuestController(QuestRepo questRepo) {
        this.questRepo = questRepo;
    }

    @PostMapping(value = "/create")
    public String createQuest(@ModelAttribute Quest quest) {
        log.info(quest.toString());
        questRepo.save(quest);
        return "ok";
    }
}
