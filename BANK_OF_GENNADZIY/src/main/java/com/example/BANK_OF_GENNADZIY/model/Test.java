package com.example.BANK_OF_GENNADZIY.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "TESTEST")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String surname;
    private Date date;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    public Date getDate() {
        return new Date();
    }
}
