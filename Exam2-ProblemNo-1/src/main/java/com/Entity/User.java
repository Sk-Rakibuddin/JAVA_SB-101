package com.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="User")
public class User {
     @Id
     private int userId;
     private String userName;
     private String emailid;
     @Embedded
     @ElementCollection(fetch = FetchType.EAGER)
     @JoinTable(name="PhoneNumber",joinColumns = @JoinColumn(name="userId"))
     private Set<PhoneNumber> phonenumber=new HashSet<>();

    public User(int userId, String userName, String emailid, Set<PhoneNumber> phonenumber) {
        this.userId = userId;
        this.userName = userName;
        this.emailid = emailid;
        this.phonenumber = phonenumber;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public Set<PhoneNumber> getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Set<PhoneNumber> phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", emailid='" + emailid + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
