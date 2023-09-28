package com.submit.Event.management.repo;

import com.submit.Event.management.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface IEventRepo extends CrudRepository<Event,Long> {

    @Query("SELECT e FROM Event e WHERE e.date = :date")
    List<Event> findByDate(@Param("date") Date date);
}
