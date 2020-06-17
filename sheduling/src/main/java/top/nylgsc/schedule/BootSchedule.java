package top.nylgsc.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author suchong
 * @create 2020/6/17  10:21
 * SpringBoot定时任务
 **/
@Component
public class BootSchedule {

    private final DateTimeFormatter fmt=DateTimeFormatter.ofPattern("yyyy:MM:dd  HH:mm:ss");

    //上一次执行开始之后3秒开始执行
    @Scheduled(fixedRate = 3000)
    public void scheDule01(){
        System.out.println(LocalDateTime.now().format(fmt));
    }

    //上一次执行结束时间点之后3秒开始执行
    @Scheduled(fixedDelay = 3000)
    public void scheDule02(){
        System.out.println(LocalDateTime.now().format(fmt));
    }

    //第一次延迟2秒执行，之后每隔3秒执行
    @Scheduled(initialDelay = 2000, fixedRate = 3000)
    public void scheDule03(){
        System.out.println(LocalDateTime.now().format(fmt));
    }

    @Scheduled(cron = "*/3 * * * *?")
    public void scheDule04(){
        System.out.println(LocalDateTime.now().format(fmt));
    }

}
