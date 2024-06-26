package com.hampcode.bankingservice.model.dto;

import com.hampcode.bankingservice.model.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponseDTO {
    private Long id;
    private AccountResponseDTO targetAccount;
    private BigDecimal amount;
    private String description;
}
