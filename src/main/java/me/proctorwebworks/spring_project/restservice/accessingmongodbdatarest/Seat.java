package me.proctorwebworks.spring_project.restservice.accessingmongodbdatarest;

import org.springframework.data.annotation.Id;

public class Seat {
    @Id private String id;

    private Room room;
}
