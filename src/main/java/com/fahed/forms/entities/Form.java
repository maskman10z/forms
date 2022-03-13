package com.fahed.forms.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    private String question6;
    private String question7;
    private String question8;
    private String question9;
    private String question10;
    private String question11;
    private String question12;

    public String toEmail() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n\n Klasse: " + question11);
        builder.append("\n Fach: " + question12);
        builder.append("\n Haben Sie sich selbst auf den Unterricht vorbereitet? " + question1);
        builder.append("\n Wurde im Unterricht Ihr Verhalten interpretiert und gedeutet? " + question2);
        builder.append("\n Konnten Sie dem Unterrichtsverlauf folgen? " + question3);
        builder.append("\n Haben Sie während des Unterrichts Störungen wahrgenommen? " + question4);
        builder.append("\n Hatte Sie Möglichkeiten, sich selbst im Unterricht zu vertreten? " + question5);
        builder.append("\n Wurde die Bedeutung der Unterrichtsinhalte deutlich gemacht? " + question6);
        builder.append("\n War ihnen klar, warum sie diese Unterrichtsinhalte behandelt haben? " + question7);
        builder.append("\n Gab es für Sie Gestaltungsmöglichkeiten? " + question8);
        builder.append("\n Waren Ihnen die Bewertungskriterien bekannt? " + question9);
        builder.append("\n Wussten Sie was getan werden kann, um die eigene Leistung zu verbessern? " + question10);

        return builder.toString();
    }
}
