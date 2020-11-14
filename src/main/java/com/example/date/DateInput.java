package com.example.date;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class DateInput {

    @JsonFormat(pattern = "dd/MM/yyyy")
    public LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
