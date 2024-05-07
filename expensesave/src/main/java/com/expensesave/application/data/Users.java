package com.expensesave.application.data;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import java.time.LocalDateTime;

@Entity
public class Users extends AbstractEntity {

    private Integer user_id;
    private String first_name;
    private String last_name;
    private String password;
    @Email
    private String email;
    private LocalDateTime last_update;
    private Integer savings_amount;

    public Integer getUser_id() {
        return user_id;
    }
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getLast_update() {
        return last_update;
    }
    public void setLast_update(LocalDateTime last_update) {
        this.last_update = last_update;
    }
    public Integer getSavings_amount() {
        return savings_amount;
    }
    public void setSavings_amount(Integer savings_amount) {
        this.savings_amount = savings_amount;
    }

}
