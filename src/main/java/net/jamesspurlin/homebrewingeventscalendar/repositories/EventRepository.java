package net.jamesspurlin.homebrewingeventscalendar.repositories;

import net.jamesspurlin.homebrewingeventscalendar.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Event, Integer> {
}