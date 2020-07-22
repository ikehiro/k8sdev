package com.msa.customer.infrastructure.domain.impl;

import com.msa.customer.domain.CustomerRepository;
import com.msa.customer.infrastructure.repository.CustomerEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private CustomerEntityRepository infraRepository;
}
