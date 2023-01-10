package com.example.jpa;

import com.example.jpa.assignment.assignment03.Assignment03;
import com.example.jpa.assignment.assignment04.Assignment04;
import com.example.jpa.assignment.assignment05.Assignment05;
import com.example.jpa.assignment.assignment06.Assignment06;
import com.example.jpa.assignment.assignment07.Assignment07;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);

        printLine("Assignment 07");
        var assignment = new Assignment07();
        assignment.persistNewEntities();
        printLine("find all company customers");
        assignment.findAllCompanyCustomers().forEach(System.out::println);
        printLine("find all private customers");
        assignment.findAllPrivateCustomers().forEach(System.out::println);


//        printLine("Assignment 06");
//        var assignment = new Assignment06();
//        assignment.persistNewCustomers();
//        assignment.persistNewCars();
//        assignment.persistNewRentalContracts();
//        printLine("find all customers");
//        assignment.findAllCustomers().forEach(customer3 -> System.out.println(customer3.toString()));
//        printLine("find all cars");
//        assignment.findAllCars().forEach(cars3 -> System.out.println(cars3.toString()));
//        printLine("find all rental contracts");
//        assignment.findAllRentalContracts().forEach(rentalContract -> System.out.println(rentalContract.toString()));


//        System.out.println("===========================");
//        System.out.println("Assignment 05");
//        var assignment = new Assignment05();
//        assignment.persistNewCars();
//        System.out.println("===========================");
//        System.out.println("before deleting entries");
//        assignment.findAll().forEach(car2 -> System.out.println(car2.toString()));
//        assignment.deleteById(2);
//        System.out.println("after deleting entries");
//        assignment.findAll().forEach(car2 -> System.out.println(car2.toString()));


//        System.out.println("===========================");
//        System.out.println("Assignment 04");
//        var assignment = new Assignment04();
//        assignment.persistNewCars();
//        System.out.println("===========================");
//        System.out.println("update mileage");
//        System.out.println(assignment.getById(2));
//        assignment.updateMileage(2,485);
//        System.out.println(assignment.getById(2));
//        System.out.println("===========================");
//        System.out.println("update value");
//        System.out.println(assignment.getById(2));
//        assignment.updateRemainingValue(2,348);
//        System.out.println(assignment.getById(2));
//        System.out.println("===========================");
//        System.out.println("update last cleaned");
//        System.out.println(assignment.getById(2));
//        assignment.updateLastCleaned(2,395L);
//        System.out.println(assignment.getById(2));


//		System.out.println("===========================");
//		System.out.println("Assignment 03");
//		var assignment = new Assignment03();
//		assignment.persistNewCustomers();
//		System.out.println("===========================");
//		System.out.println("find all");
//		assignment.findAll().forEach(customer2 -> System.out.println(customer2.toString()));
//		System.out.println("===========================");
//		System.out.println("find by id");
//		System.out.println(assignment.getById(2));
//		System.out.println("===========================");
//		System.out.println("get everything < age 30");
//		assignment.getByMaxAge(29).forEach(customer2 -> System.out.println(customer2.toString()));
    }

    static void printLine(String string) {
        System.out.println("=================================================================================");
        System.out.println(string);
    }
}
