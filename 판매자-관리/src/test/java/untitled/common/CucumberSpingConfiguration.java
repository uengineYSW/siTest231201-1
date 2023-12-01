package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.판매자관리Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { 판매자관리Application.class })
public class CucumberSpingConfiguration {}
