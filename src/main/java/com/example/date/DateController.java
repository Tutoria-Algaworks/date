package com.example.date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/date")
public class DateController {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void post(@RequestBody DateInput input) {
        System.out.println(input.getDate());
    }
}
