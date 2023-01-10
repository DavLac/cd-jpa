package com.example.jpa;

import com.example.jpa.solution.assignment03.Assignment03;
import com.example.jpa.solution.assignment04.Assignment04;
import com.example.jpa.solution.assignment05.Assignment05;
import com.example.jpa.solution.assignment06.Assignment06;
import com.example.jpa.solution.assignment07.Assignment07;
import com.example.jpa.solution.assignment08.Assignment08;
import com.example.jpa.solution.assignment08.demo.Assignment08Demo;
import com.example.jpa.solution.assignment09.Assignment09;
import com.example.jpa.solution.assignment09.demo.Assignment09Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
        System.out.println("===========================");
        System.out.println("Assignment 03");
        var as03 = new Assignment03();
        as03.persistNewCustomers();
        System.out.println("===========================");
        System.out.println("find all");
        as03.findAll().forEach(customer2 -> System.out.println(customer2.toString()));
        System.out.println("===========================");
        System.out.println("find by id");
        System.out.println(as03.getById(2));
        System.out.println("===========================");
        System.out.println("get everything below age 40");
        as03.getByMaxAge(40).forEach(customer2 -> System.out.println(customer2.toString()));

        System.out.println("===========================");
        System.out.println("Assignment 04");
        var as04 = new Assignment04();
        as04.persistNewEntities();
        System.out.println("===========================");
        System.out.println("update mileage");
        System.out.println(as04.getById(2));
        as04.updateMileage(2, 123456);
        System.out.println(as04.getById(2));
        System.out.println("===========================");
        System.out.println("update value");
        System.out.println(as04.getById(1));
        as04.updateRemainingValue(1, 123456);
        System.out.println(as04.getById(1));
        System.out.println("===========================");
        System.out.println("update last cleaned");
        System.out.println(as04.getById(3));
        as04.updateLastCleaned(3, 101010L);
        System.out.println(as04.getById(3));

        System.out.println("===========================");
        System.out.println("Assignment 05");
        var as05 = new Assignment05();
        as05.persistNewEntities();
        System.out.println("===========================");
        System.out.println("delete by id");
        System.out.println("before");
        as05.findAll().forEach(entity -> System.out.println(entity.toString()));
        as05.deleteById(2);
        System.out.println("after");
        as05.findAll().forEach(entity -> System.out.println(entity.toString()));

        System.out.println("===========================");
        System.out.println("Formula - Beers");
        as03.persistBeer();
        System.out.println(as03.getBeerById(1));
        System.out.println("===========================");
        System.out.println("Where - Employees");
        as03.persistAndGetEmployee();

        System.out.println("===========================");
        System.out.println("Assignment 06");
        var as06 = new Assignment06();
        as06.persistNewEntities();
        System.out.println("===========================");
        System.out.println("Rental contracts");
        as06.findAllRentalContracts().forEach(System.out::println);

        System.out.println("===========================");
        System.out.println("Assignment 07");
        var as07 = new Assignment07();
        as07.persistNewEntities();
        System.out.println("===========================");
        System.out.println("Company customers");
        as07.findAllCompanyCustomers().forEach(System.out::println);
        System.out.println("===========================");
        System.out.println("Private customers");
        as07.findAllPrivateCustomers().forEach(System.out::println);

        System.out.println("===========================");
        System.out.println("Assignment 08 demo");
        var as08d = new Assignment08Demo();
        as08d.persistNewEntities();
        System.out.println("===========================");
        System.out.println("findCustomerByName");
        System.out.println(as08d.findCustomerByName("Name"));

        System.out.println("===========================");
        System.out.println("Assignment 08");
        var as08 = new Assignment08();
        as08.persistNewEntities();
        System.out.println("===========================");
        System.out.println("findAllContractsFromPeopleFromUtrecht");
        as08.findAllContractsFromPeopleFromUtrecht().forEach(System.out::println);
        System.out.println("===========================");
        System.out.println("findAllPeopleThatRentedFordCars");
        as08.findAllPeopleThatRentedFordCars().forEach(System.out::println);
        System.out.println("===========================");
        System.out.println("findAllPeopleThatRentedAtLeastTwoDifferentCars");
        as08.findAllPeopleThatRentedAtLeastTwoDifferentCars().forEach(System.out::println);

        System.out.println("===========================");
        System.out.println("Assignment 09 demo");
        var as09d = new Assignment09Demo();
        as09d.persistNewEntities();

        System.out.println("===========================");
        System.out.println("Assignment 09");
        var as09 = new Assignment09();
        as09.persistNewEntities();
        as09.findAll().forEach(System.out::println);
    }

}
