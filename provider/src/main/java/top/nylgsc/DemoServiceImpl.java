package top.nylgsc;

import org.apache.dubbo.config.annotation.Service;
import top.nylgsc.service.DemoService;

/**
 * @author suchong
 * @create 2020/6/16  11:17
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello-----"+name;
    }
}
