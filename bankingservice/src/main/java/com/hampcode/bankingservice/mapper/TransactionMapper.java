package com.hampcode.bankingservice.mapper;

import com.hampcode.bankingservice.model.dto.TransactionReportDTO;
import com.hampcode.bankingservice.model.dto.TransactionRequestDTO;
import com.hampcode.bankingservice.model.dto.TransactionResponseDTO;
import com.hampcode.bankingservice.model.entity.Transaction;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@AllArgsConstructor
public class TransactionMapper {
    private final ModelMapper modelMapper;

    public Transaction converttoEntity(TransactionRequestDTO transactionDTO){
        return modelMapper.map(transactionDTO, Transaction.class);
    }

    public TransactionResponseDTO converttoDTO(Transaction transaction){
        return modelMapper.map(transaction, TransactionResponseDTO.class);
    }

    public List<TransactionResponseDTO> convertToListDTO(List<Transaction> transactions){
        return transactions.stream()
                .map(this::converttoDTO)
                .toList();
    }

    public TransactionReportDTO convertTransactionReportDTO(Object[] transactionData){
        TransactionReportDTO reportDTO = new TransactionReportDTO();
        reportDTO.setDate((LocalDate) transactionData[0]);
        reportDTO.setTransactionCount((Long) transactionData[1]);
        return reportDTO;
    }
}
