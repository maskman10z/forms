package com.fahed.forms.services;

import com.fahed.forms.entities.Form;
import com.fahed.forms.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    @Autowired
    private FormRepository repository;

    public void save(Form form) throws Exception {
        if (repository.findById(form.getId()).isPresent())
            throw new Exception("Form already present");
        repository.save(form);
    }

    public Iterable<Form> getAll() {
        return repository.findAll();
    }
}
