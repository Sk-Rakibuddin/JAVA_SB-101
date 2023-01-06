package com.bean;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mail_id;
    private String email;
    private LocalDateTime created_date;
    @OneToOne(mappedBy = "email",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private User user;

    public int getMail_id() {
        return mail_id;
    }

    public void setMail_id(int mail_id) {
        this.mail_id = mail_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date) {
        this.created_date = created_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Email{" +
                "mail_id=" + mail_id +
                ", email='" + email + '\'' +
                ", created_date=" + created_date +
                ", user=" + user +
                '}';
    }
//
//    1. Retrieve All Users
//2. Create a User
//3. Retrieve One User
//4. Delete a User
//7. Retrieve Detail of email for a user
//6. Create a email for a user


}
