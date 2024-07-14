package ru.gb.spring_first_project.hw;

import java.time.LocalDateTime;

public class Ticket {
    private final String number;
    private final LocalDateTime createdAt;

    public Ticket(String number, LocalDateTime createdAt){
        this.number = number;
        this.createdAt = createdAt;
    }

    public String getNumber() {
        return number;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
