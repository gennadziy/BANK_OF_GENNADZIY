package com.example.BANK_OF_GENNADZIY.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
@Table(name = "TESTEST")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

}
