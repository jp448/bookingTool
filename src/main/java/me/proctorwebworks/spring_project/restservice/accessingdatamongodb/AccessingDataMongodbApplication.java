package me.proctorwebworks.spring_project.restservice.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

    @Autowired
    private WorkerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMongodbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        // save a couple of customers
        repository.save(new Worker("Alice", "Smith"));
        repository.save(new Worker("Bob", "Smith"));

        // fetch all customers
        System.out.println("Workers found with findAll():");
        System.out.println("-------------------------------");
        for (Worker worker : repository.findAll()) {
            System.out.println(worker);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Worker found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Workers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Worker worker : repository.findByLastName("Smith")) {
            System.out.println(worker);
        }

    }

}
