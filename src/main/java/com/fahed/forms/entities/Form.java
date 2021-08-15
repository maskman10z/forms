package com.fahed.forms.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Form {

    @Id
    private String id;

    @NonNull
    private String firstName;

    @NotNull
    private String lastName;


}
