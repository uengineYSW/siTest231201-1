package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.관리자지원Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { 관리자지원Application.class })
public class CucumberSpingConfiguration {}
