package com.nathan.daniel.Code.Blog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_POST")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Não pode estar vazio!")
    private String title;

    @NotBlank(message = "Não pode estar vazio!")
    private String author;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate creation;

    @NotBlank(message = "Não pode estar vazio!")
    @Lob
    private  String text;

}
