package com.example.CrudProject.ProjectCrud.controllers;

import com.example.CrudProject.ProjectCrud.ProjectCrudApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProjectCrudApplication.class);
    }

}