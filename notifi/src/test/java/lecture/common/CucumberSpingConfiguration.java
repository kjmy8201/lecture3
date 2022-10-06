package lecture.common;


import lecture.NotifiApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { NotifiApplication.class })
public class CucumberSpingConfiguration {
    
}
