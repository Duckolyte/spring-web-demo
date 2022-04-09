package ch.ag.me.springwebdemo.controller;

import ch.ag.me.springwebdemo.model.entity.Example2Entity;
import ch.ag.me.springwebdemo.model.entity.ExampleEntity;
import ch.ag.me.springwebdemo.model.entity.Test;
import ch.ag.me.springwebdemo.model.repository.Example2Repository;
import ch.ag.me.springwebdemo.model.repository.ExampleRepository;
import ch.ag.me.springwebdemo.model.repository.TestRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    TestRepository repository;
    Example2Repository example2Repository;
    ExampleRepository exampleRepository;

    public TestController(TestRepository repository, Example2Repository example2Repository, ExampleRepository exampleRepository) {
        this.repository = repository;
        this.example2Repository = example2Repository;
        this.exampleRepository = exampleRepository;
    }

    @GetMapping("/tests")
    public List<String> getTests() {
        return List.of(new String[]{"True", "Lol"});
    }

    @GetMapping("/example2/{id}")
    public List<Example2Entity> getExamples2(@PathVariable String id) {
        List<Example2Entity> entity = example2Repository.getExample2EntityByFirstName(id);
        return entity;
    }

    @GetMapping("/example/{id}")
    public List<ExampleEntity> getExamples(@PathVariable String id) {
        List<ExampleEntity> entity = exampleRepository.getExampleEntityByFirstName(id);
        return entity;
    }

    @GetMapping("/tests/{id}")
    public Test getTests(@PathVariable String id) {
        Test test = repository.getTestByFirstname(id);
        return test;
    }

}
