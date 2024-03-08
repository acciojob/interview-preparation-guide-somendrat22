package com.driver.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.driver.*;
@SpringBootTest
class TestCases {

	@Test
    void testDefaultConstructor() {
        InterviewTopic topic = new InterviewTopic();
        assertNotNull(topic);
        assertNull(topic.getId());
        assertNull(topic.getName());
    }

    @Test
    void testParameterizedConstructor() {
        Long id = 1L;
        String name = "Java";
        InterviewTopic topic = new InterviewTopic(id, name);
        assertNotNull(topic);
        assertEquals(id, topic.getId());
        assertEquals(name, topic.getName());
    }
    
    @Test
    void testGetterAndSetter() {
        InterviewTopic topic = new InterviewTopic();
        Long id = 2L;
        String name = "Spring";
        
        // Test setters
        topic.setId(id);
        topic.setName(name);

        // Test getters
        assertEquals(id, topic.getId());
        assertEquals(name, topic.getName());
    }
    
    @Test
    void testToStringMethod() {
        Long id = 3L;
        String name = "Database";
        InterviewTopic topic = new InterviewTopic(id, name);
        
        String expectedToString = "InterviewTopic{id=3, name='Database'}";
        assertEquals(expectedToString, topic.toString());
    }



}
