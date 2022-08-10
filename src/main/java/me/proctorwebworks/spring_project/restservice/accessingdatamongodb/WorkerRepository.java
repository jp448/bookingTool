package me.proctorwebworks.spring_project.restservice.accessingdatamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerRepository extends MongoRepository<Worker, String> {

  Worker findByFirstName(String firstName);
  List<Worker> findByLastName(String lastName);

}