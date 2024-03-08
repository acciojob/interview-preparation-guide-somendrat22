package com.driver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class InterviewTopicController {
    private List<InterviewTopic> topics = new ArrayList<>();
    private long nextId = 1;

    @PostMapping
    public InterviewTopic addTopic(@RequestBody InterviewTopic topic) {
        topic.setId(nextId++);
        topics.add(topic);
        return topic;
    }

    @GetMapping
    public List<InterviewTopic> getAllTopics() {
        return topics;
    }

    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable Long id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}