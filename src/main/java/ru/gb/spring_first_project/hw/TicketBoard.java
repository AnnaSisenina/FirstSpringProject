package ru.gb.spring_first_project.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("singleton")
public class TicketBoard {
    private final TicketNumberGenerator ticketNumberGenerator;

    @Autowired
    public TicketBoard(TicketNumberGenerator ticketNumberGenerator){
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket() {
        String number = ticketNumberGenerator.createNewNumber();
        LocalDateTime createdAt = LocalDateTime.now();
        return new Ticket(number, createdAt);
    }
}
