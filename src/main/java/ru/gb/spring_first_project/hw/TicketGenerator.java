package ru.gb.spring_first_project.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketGenerator {
    @Autowired
    private TicketBoard ticketBoard;

    public void createNewTicket(){
        Ticket ticket = ticketBoard.newTicket();
        System.out.println("Ticket#"+ ticket.getNumber() + " dated " + ticket.getCreatedAt());
    }
}
