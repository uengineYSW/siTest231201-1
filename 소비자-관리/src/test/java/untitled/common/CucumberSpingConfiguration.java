package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.소비자관리Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { 소비자관리Application.class })
public class CucumberSpingConfiguration {}
