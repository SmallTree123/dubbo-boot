package top.nylgsc;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.nylgsc.service.DemoService;

/**
 * @author suchong
 * @create 2020/6/16  12:03
 **/
@RestController
public class controller {

    @Reference
    DemoService demoService;

    @RequestMapping(value = "/say/{name}")
    @ResponseBody
    public String say(@PathVariable String name){
        return demoService.sayHello(name);
    }
}
