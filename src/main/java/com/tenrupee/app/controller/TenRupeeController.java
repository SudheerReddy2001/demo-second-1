package com.tenrupee.app.controller;

import com.tenrupee.app.model.TenRupee;
import com.tenrupee.app.service.TenRupeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TenRupeeController {

    @Autowired
    private TenRupeeService tenRupeeService;

    // http://localhost:8080/1
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TenRupee getById(@PathVariable("id") long id) {
        return tenRupeeService.getById(id);
    }

    // http://localhost:8080/all
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<TenRupee> getAll() {
        return tenRupeeService.getAllAjay();
    }


}
