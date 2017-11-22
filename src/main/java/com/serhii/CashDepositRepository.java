package com.serhii;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CashDepositRepository extends JpaRepository<CashDeposit, Long> {
}
