package com.zjz;

import com.zjz.entity.Dog;
import com.zjz.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStudy02ApplicationTests {
    @Autowired
    private Person person;

    @Autowired
    private Dog dog;

    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println(dog);
    }

}
