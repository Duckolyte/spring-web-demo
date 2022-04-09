package ch.ag.me.springwebdemo.model.repository;

import ch.ag.me.springwebdemo.model.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {

    Test getTestByFirstname(String firstname);

}
