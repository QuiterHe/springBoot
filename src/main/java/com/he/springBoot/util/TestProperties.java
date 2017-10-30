package com.he.springBoot.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * application.properties 中文乱码
 */

@Component
public class TestProperties {
    @Value("${com.he.springBoot.title}")
    private String title;

    @Value("${com.he.springBoot.content}")
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
