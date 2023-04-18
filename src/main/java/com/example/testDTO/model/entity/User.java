package com.example.testDTO.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "Users")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {
    @Id
    @SequenceGenerator(
            name = "sequence_user",
            sequenceName = "sequence_user",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "sequence_user",
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Long age;

    @Column(name = "nationality")
    private String nationality;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return getId() != null && Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
