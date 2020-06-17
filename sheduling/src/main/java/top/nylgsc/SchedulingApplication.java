package top.nylgsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author suchong
 * @create 2020/6/17  10:19
 **/

@EnableScheduling //开启定时任务
@SpringBootApplication
public class SchedulingApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchedulingApplication.class,args);
    }
}
