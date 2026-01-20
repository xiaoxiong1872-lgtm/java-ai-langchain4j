package com.bedi.javaailangchain4j;

import com.bedi.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PromptTest {
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(3,"今天几号");
        System.out.println(answer);
    }

    @Test
    public void testSystemMessage2() {
        String answer = separateChatAssistant.chat2(3,"今天几号");
        System.out.println(answer);
    }

    @Test
    public void testSystemMessage3() {
        String answer = separateChatAssistant.chat3(33,"今天几号","小宝",18);
        System.out.println(answer);
    }
}
