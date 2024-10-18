package br.com.fitapp.infrastructure.group.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Table(name = "\"group\"")
@Data
public class GroupModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GROUP")
    private Long id;
    @NotNull
    private String uuid;
    @NotNull
    private String name;
    private String discription;
    private String photoUrl;
}
