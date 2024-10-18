package br.com.fitapp.infrastructure.exercise.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Table(name = "\"exercise\"")
@Data
public class ExerciseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EXERCISE")
    private Long id;
    @NotNull
    private String uuid;
    @NotNull
    private String name;
    private String discription;
    private String mediaContent;
}
