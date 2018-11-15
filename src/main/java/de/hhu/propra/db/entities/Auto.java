package de.hhu.propra.db.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Auto{
    @Id
    private long id;

    private String marke;
    private String farbe;
    private String hubraum;
}
