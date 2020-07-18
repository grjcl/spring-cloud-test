package com.southwind.service;

import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value="province",fallback=FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public abstract Collection<Student> findAll();
    @GetMapping("/student/index")
    public abstract String index();
}
