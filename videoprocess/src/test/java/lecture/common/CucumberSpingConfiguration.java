package lecture.common;


import lecture.VideoprocessApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoprocessApplication.class })
public class CucumberSpingConfiguration {
    
}
