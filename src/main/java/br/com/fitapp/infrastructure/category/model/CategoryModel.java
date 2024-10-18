package br.com.fitapp.infrastructure.category.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Table(name = "\"category\"")
@Data
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORY")
    private Long id;
    @NotNull
    private String uuid;
    @NotNull
    private String name;
    private String discription;
    private String photoUrl;
}
