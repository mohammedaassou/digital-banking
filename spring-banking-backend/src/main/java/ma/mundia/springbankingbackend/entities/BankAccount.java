
package  ma.mundia.springbankingbackend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.mundia.springbankingbackend.enums.AccountStatus;

import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
class BankAccount {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  double balance;
    private  String createdAt;
    private AccountStatus status;
    @ManyToOne
    private  Customer customer;
    @OneToMany( mappedBy = "bankAccount")
    private List<AccountOperation> accountOperations;
}

