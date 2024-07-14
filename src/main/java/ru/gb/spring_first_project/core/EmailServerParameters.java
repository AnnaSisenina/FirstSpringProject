package ru.gb.spring_first_project.core;

import org.springframework.stereotype.Component;

@Component
public class EmailServerParameters {
    private String login;
    private String serverEmail;

    public EmailServerParameters() {
        this.login = "login";
        this.serverEmail = "server@server.ru";
    }

    public String getLogin() {
        return login;
    }

    public String getServerEmail() {
        return serverEmail;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setServerEmail(String serverEmail) {this.serverEmail = serverEmail;}
}
