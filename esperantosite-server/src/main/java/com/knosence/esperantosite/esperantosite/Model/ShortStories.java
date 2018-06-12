package com.knosence.esperantosite.esperantosite.Model;

public class ShortStories {

    private final long id;
    private final String content;

    public ShortStories(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}