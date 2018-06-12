package com.knosence.esperantosite.esperantosite.Controller;

import java.util.concurrent.atomic.AtomicLong;

import com.knosence.esperantosite.esperantosite.Model.ShortStories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortStoriesController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public ShortStories shortStories(@RequestParam(value="name", defaultValue="World") String name) {
        return new ShortStories(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/getShortStories")
    public ShortStories getShortStories(){
        return getShortStories();
    }
}