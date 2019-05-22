package com.example.dependencyinjections;

import com.example.dependencyinjections.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionsApplication implements CommandLineRunner {
  
  private Printer printer;
  
  @Autowired
  public DependencyinjectionsApplication(Printer printer) {
    this.printer = printer;
  }
  
  public static void main(String[] args) {
    SpringApplication.run(DependencyinjectionsApplication.class, args);
  }
  
  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
  }
}
