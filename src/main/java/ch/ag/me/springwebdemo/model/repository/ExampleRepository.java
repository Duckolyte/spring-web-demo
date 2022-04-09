package ch.ag.me.springwebdemo.model.repository;

import ch.ag.me.springwebdemo.model.entity.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExampleRepository extends JpaRepository<ExampleEntity, Long> {
    List<ExampleEntity> getExampleEntityByFirstName(String firstName);
}
