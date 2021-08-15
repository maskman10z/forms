package com.fahed.forms.repositories;

import com.fahed.forms.entities.Form;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends CrudRepository<Form, String> {
}
