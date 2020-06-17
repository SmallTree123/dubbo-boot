package top.nylgsc.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author suchong
 * @create 2020/6/17  10:48
 * @Desc 异步处理服务
 **/
@Component
public class AsyncService {

    //异步无返回值任务
    @Async("getAsyncExecutor")
    public void asyncProcess() throws Exception{
        System.out.println(Thread.currentThread().getName()+"----------------");
        TimeUnit.SECONDS.sleep(2);
    }


    @Async
    public Future<Integer> asyncProcessHasReturn() throws Exception{
        System.out.println(Thread.currentThread().getName()+"----------------");
        TimeUnit.SECONDS.sleep(2);
        return new AsyncResult<>(100);
    }

}
