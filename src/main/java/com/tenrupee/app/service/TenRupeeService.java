package com.tenrupee.app.service;

import com.tenrupee.app.model.TenRupee;
import com.tenrupee.app.repository.TenRupeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenRupeeService {

    @Autowired
    private TenRupeeRepository tenRupeeRepository;

    public TenRupee getById(long id) {
        return tenRupeeRepository.findById(id).get();
    }

    public List<TenRupee> getAllAjay() {
        return tenRupeeRepository.findAll();
    }
}
