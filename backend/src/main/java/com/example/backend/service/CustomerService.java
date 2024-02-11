package com.example.backend.service;

import com.example.backend.model.dto.CustomerInfoDTO;
import com.example.backend.model.dto.NewCustomerDTO;


public interface CustomerService {

    public void newCustomer(NewCustomerDTO dto);

    public CustomerInfoDTO getCustomerByCpf(String cpf);
}
