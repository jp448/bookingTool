package me.proctorwebworks.spring_project.restservice.accessingmongodbdatarest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeatRepository extends MongoRepository<Seat, String> {

}
