package com.cproject.svmeta.services;

import com.cproject.svmeta.entities.Sale;
import com.cproject.svmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> findSales(){
        return saleRepository.findAll();
    }

}
