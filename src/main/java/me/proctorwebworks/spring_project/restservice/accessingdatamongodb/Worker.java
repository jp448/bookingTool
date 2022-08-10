package me.proctorwebworks.spring_project.restservice.accessingdatamongodb;

import org.springframework.data.annotation.Id;


public class Worker {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Worker() {}

    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Worker[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}