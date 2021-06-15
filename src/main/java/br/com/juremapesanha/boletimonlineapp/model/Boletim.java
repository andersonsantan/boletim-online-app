package br.com.juremapesanha.boletimonlineapp.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Boletim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @NotNull
    private Long matricula;

    @Getter
    @NotNull
    private String nome;

    @Getter
    private String glb;

    @Getter
    private String cie;

    @Getter
    private String ef;

    @Getter
    private String geo;

    @Getter
    private String his;

    @Getter
    private String lp;

    @Getter
    private String mat;

    @Getter
    private String art;

    @Getter
    private String ing;

    @Getter
    private String turma;

    @Getter
    private double freq;

}
