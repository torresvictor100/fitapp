package br.com.fitapp.infrastructure.member.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "\"member\"")
@Data
public class MemberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MEMBER")
    private Long id;
    @NotNull
    private String uuid;
    @NotNull
    private String name;
    private String discription;
    private String photoUrl;
}
