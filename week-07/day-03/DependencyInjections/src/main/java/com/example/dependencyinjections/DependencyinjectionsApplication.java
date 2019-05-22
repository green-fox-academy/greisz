package com.example.dependencyinjections;

import com.example.dependencyinjections.service.MyColor;
import com.example.dependencyinjections.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionsApplication implements CommandLineRunner {
  
  private Printer printer;
  private MyColor myColor;
  
  @Autowired
  public DependencyinjectionsApplication(@Qualifier("BlueColor") MyColor myColor, Printer printer) {
    this.printer = printer;
    this.myColor = myColor;
  }
  
  public static void main(String[] args) {
    SpringApplication.run(DependencyinjectionsApplication.class, args);
  }
  
  @Override
  public void run(String... args) throws Exception {
    printer.log(myColor.printColor());
  }
}
