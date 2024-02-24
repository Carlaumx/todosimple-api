package dev.carlaum.todosimple.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @Column(unique = true, nullable = false)
    @NotBlank
    @Size(min = 3, max = 100)
    private String username;
    @Column(nullable = false)
    @NotBlank
    @Size(min = 8, max = 100)
    private String password;

//    private List<Task> tasks;

}
