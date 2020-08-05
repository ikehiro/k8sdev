package com.msa.customer.domain;

public interface CustomerRepository {

    /**
     * 顧客情報を永続化する
     *
     * @param customer
     */
    void save(Customer customer);

    /**
     * 顧客情報を取得する
     *
     * @param customerId 顧客ID
     * @return 顧客情報
     */
    Customer findById(Long customerId);
}
