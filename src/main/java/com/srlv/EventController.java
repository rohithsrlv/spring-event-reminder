package com.srlv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    private final Event event;

    public EventController(Event event) {
        this.event = event;
    }

    @GetMapping("/reminder")
    public String reminder() {
        return event.eventReminderWeb();
    }
}
