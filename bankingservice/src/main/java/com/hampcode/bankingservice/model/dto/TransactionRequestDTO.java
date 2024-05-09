package com.hampcode.bankingservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequestDTO {
    private Long id;

    @NotNull(message = "El numero de la cuenta origen no puede estar vacio")
    private String sourceAccountNumber;

    @NotNull(message = "El numero de la cuenta destino no puede estar vacio")
    private String targetAccountNumber;

    @NotNull(message = "La cantidad no puede estar vacia")
    @DecimalMin(value = "0.01", message = "La cantidad debe ser mayor que cero")
    private BigDecimal amount;

    @NotBlank(message = "La descripcion no puede estar vacia")
    private String description;
}
