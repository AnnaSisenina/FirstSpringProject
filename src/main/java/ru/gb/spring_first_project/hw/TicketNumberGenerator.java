package ru.gb.spring_first_project.hw;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("singleton")
public class TicketNumberGenerator {
    public String createNewNumber() {
        return UUID.randomUUID().toString();
    }
}
