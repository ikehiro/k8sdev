package com.msa.customer.infrastructure.domain.impl;

import com.msa.customer.domain.Customer;
import com.msa.customer.domain.CustomerRepository;
import com.msa.customer.infrastructure.entity.CustomerEntity;
import com.msa.customer.infrastructure.repository.CustomerEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private CustomerEntityRepository infraRepository;

    @Override
    public void save(Customer customer) {
        CustomerEntity entity = new CustomerEntity();
        infraRepository.save(entity);
    }

    @Override
    public Customer findById(Long customerId) {
        return null;
    }
}
