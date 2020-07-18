package com.southwind.service;

import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value="province")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();
    @GetMapping("/student/index")
    String index();
}
