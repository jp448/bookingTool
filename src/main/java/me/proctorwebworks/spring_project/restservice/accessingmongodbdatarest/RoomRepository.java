package me.proctorwebworks.spring_project.restservice.accessingmongodbdatarest;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface RoomRepository extends MongoRepository<Room, String> {

    List<Room> findByName(@Param("name") String name);

}
