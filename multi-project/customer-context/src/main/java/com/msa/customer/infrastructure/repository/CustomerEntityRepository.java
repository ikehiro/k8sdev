package com.msa.customer.infrastructure.repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import com.msa.customer.infrastructure.entity.CustomerEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface CustomerEntityRepository {

    @Insert(exclude = {"vc"})
    int save(CustomerEntity n);

    @Select()
    List<CustomerEntity> findAll();
}
