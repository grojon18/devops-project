package no.kristiania.pg3301.devops.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue
    private long Id;

    private String personalNumber;
    private String accountNumber;


}
