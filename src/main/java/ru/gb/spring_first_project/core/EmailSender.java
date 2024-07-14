package ru.gb.spring_first_project.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    private final EmailServerParameters parameters;

    @Autowired //construction injection
    public EmailSender(EmailServerParameters parameters){
        this.parameters = parameters;
    }

    public void sendEmail(String subject, String body, String recipient){
        System.out.println("Письмо [" + subject + "] отправлено получателю (" + recipient +")" );
        System.out.println("Письмо отправлено на адрес сервера [" + parameters.getServerEmail() + ']' );
    }
}
