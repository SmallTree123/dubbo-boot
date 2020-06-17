# dubbo-boot
SpringBoot整合dubbo

common-api主要存放的是一些公用接口
需要注意的是接口需要放在指定的包路径下，否则其他服务即使导入了依赖也无法使用

provider服务提供者，主要是对接口的实现

consumer服务消费者，主要是调用接口来实现功能
