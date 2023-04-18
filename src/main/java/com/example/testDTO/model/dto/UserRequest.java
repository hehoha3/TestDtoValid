package com.example.testDTO.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    private Long id;

    @NotNull(message = "Name Shouldn't Be NULL")
    @NotEmpty(message = "Name Shouldn't Be Empty")
    private String name;

    @NotNull(message = "Email Shouldn't Be NULL")
    @NotEmpty(message = "Email Shouldn't Be Empty")
    private String email;

    @NotNull(message = "Mobile Shouldn't Be NULL")
    @NotEmpty(message = "Mobile Shouldn't Be Empty")
    private String mobile;

    @NotNull(message = "Gender Shouldn't Be NULL")
    @NotEmpty(message = "Gender Shouldn't Be Empty")
    private String gender;

    @Min(value = 18, message = "You Are Under 18 !!")
    @NotNull(message = "Age Shouldn't Be NULL")
    private Long age;

    @NotNull(message = "Nationality Shouldn't Be NULL")
    @NotEmpty(message = "Nationality Shouldn't Be Empty")
    private String nationality;
}
