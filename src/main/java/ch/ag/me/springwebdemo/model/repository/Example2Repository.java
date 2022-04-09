package ch.ag.me.springwebdemo.model.repository;

import ch.ag.me.springwebdemo.model.entity.Example2Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Example2Repository extends JpaRepository<Example2Entity, Long> {
    List<Example2Entity> getExample2EntityByFirstName(String firstName);
}
