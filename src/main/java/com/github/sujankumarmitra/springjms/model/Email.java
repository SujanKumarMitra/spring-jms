package com.github.sujankumarmitra.springjms.model;

import java.util.Objects;

public class Email {

    private String to;
    private String from;
    private String content;

    public Email() {
    }

    public Email(String to, String from, String content) {
        this.to = to;
        this.from = from;
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Email)) return false;
        Email email = (Email) o;
        return Objects.equals(to, email.to) && Objects.equals(from, email.from) && Objects.equals(content, email.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, from, content);
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
