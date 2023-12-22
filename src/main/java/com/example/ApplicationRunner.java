package com.example;

import com.example.container.Container;
import com.example.database.pool.ConnectionPool;
import com.example.database.repository.CompanyRepository;
import com.example.database.repository.UserRepository;
import com.example.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
//        как это делается без dependency injection
//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

//        как это делается с dependency injection
        var container = new Container();
        var userService = new UserService(container.get(UserRepository.class), container.get(CompanyRepository.class));
    }
}
