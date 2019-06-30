package com.vertisage.vms.persistence;

import com.vertisage.vms.domain.Visitor;
import org.springframework.boot.CommandLineRunner;

public class DBUtility implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Visitor visitor = new Visitor("Amit", "Singh",
                "981100568", "aamit01.singh@gmail.com");

    }
}
