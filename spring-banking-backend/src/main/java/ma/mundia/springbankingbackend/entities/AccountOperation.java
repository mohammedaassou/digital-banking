package ma.mundia.springbankingbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.mundia.springbankingbackend.enums.OperationType;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class AccountOperation {
    private Long id;
    private String operationDate;
    private double amount;
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount;
}
