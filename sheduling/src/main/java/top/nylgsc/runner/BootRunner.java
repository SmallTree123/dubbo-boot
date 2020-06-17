package top.nylgsc.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author suchong
 * @create 2020/6/17  11:36
 **/
@Component
public class BootRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("开机启动boot");
    }
}
