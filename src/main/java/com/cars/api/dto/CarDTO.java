package com.cars.api.dto;

import java.sql.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public record CarDTO(

    @NotBlank
    String modelo,

    @NotBlank
    String fabricante, 

    @PastOrPresent
    Date dataFabricacao,

    @NotNull
    @Positive
    double valor,

    @NotNull
    @Min(1870)
    @Max(2200)
    int anoModelo

    ) {
    
}

