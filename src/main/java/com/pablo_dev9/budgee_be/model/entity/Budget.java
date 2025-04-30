package com.pablo_dev9.budgee_be.model.entity;

import com.pablo_dev9.budgee_be.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "budgets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Budget extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "initial_amount", precision = 10, scale = 2, nullable = false)
    private BigDecimal initialAmount;

    @Column(name = "remaining_amount", precision = 10, scale = 2, nullable = false)
    private BigDecimal remainingAmount;

    public Budget(BigDecimal initialAmount, BigDecimal remainingAmount) {
        this.initialAmount = initialAmount;
        this.remainingAmount = remainingAmount;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
