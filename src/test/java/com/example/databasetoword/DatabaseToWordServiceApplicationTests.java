package com.example.databasetoword;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DatabaseToWordServiceApplicationTests {

    @Autowired
    private DatabaseToWordService databaseToWordService;

    @Test
    public void test(){
        databaseToWordService.documentGeneration();
    }

}
