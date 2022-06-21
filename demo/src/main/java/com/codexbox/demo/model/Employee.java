package com.codexbox.demo.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class Employee {
    private int eid;
    private String name;
    private String address;
    private long salary;

    @Value("${datasource.data}")
    private String data;

}
