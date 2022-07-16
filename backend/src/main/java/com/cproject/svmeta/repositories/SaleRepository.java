package com.cproject.svmeta.repositories;

import com.cproject.svmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository <Sale, Long> {
}
