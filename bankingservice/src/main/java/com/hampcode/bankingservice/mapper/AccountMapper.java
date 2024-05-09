package com.hampcode.bankingservice.mapper;

import com.hampcode.bankingservice.model.dto.AccountRequestDTO;
import com.hampcode.bankingservice.model.dto.AccountResponseDTO;
import com.hampcode.bankingservice.model.entity.Account;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class AccountMapper {

    private final ModelMapper modelMapper;

    public Account converttoEntity(AccountRequestDTO accountRequestDTO) {
        return modelMapper.map(accountRequestDTO, Account.class);
    }

    public AccountResponseDTO converttoDTO(Account account) {
        return modelMapper.map(account, AccountResponseDTO.class);
    }

    public List<AccountResponseDTO> converttoDTO(List<Account> accounts) {
        return accounts.stream()
                .map(this::converttoDTO)
                .toList();
    }
}
