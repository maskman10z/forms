package com.fahed.forms.controllers;

import com.fahed.forms.entities.Form;
import com.fahed.forms.services.EmailService;
import com.fahed.forms.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static com.fahed.forms.utils.Constants.EMAIL_SUBJECT;
import static com.fahed.forms.utils.Constants.RECEIVER_EMAIL;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FormController {

    @Autowired
    private FormService service;

    @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public Iterable<Form> getAll() {
        return service.getAll();
    }

    @PostMapping("/questionnaire")
    public void post(@RequestBody @Validated Form form) throws Exception {
        service.save(form);
        emailService.send(RECEIVER_EMAIL, EMAIL_SUBJECT, form.toString());
    }
}