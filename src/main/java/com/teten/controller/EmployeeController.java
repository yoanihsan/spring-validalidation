package com.teten.controller;

import com.teten.request.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/api")
public class EmployeeController {
    @PostMapping("/employee")
    public ResponseEntity<Employee> get(@RequestBody @Valid Employee req) {

        return ResponseEntity.ok(req);
    }
}
