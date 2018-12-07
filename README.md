# SpringCloud Greenwich 版本聚合工程案例项目---BaseOn SpringBoot 2.1.0.RELEASE

## 聚合工程结构
```
scexample/
├── config-client                    #配置使用者子工程：从配置中心读取配置
├── config-server                    #配置中心子工程：配置提供
├── eureka-server                    #注册中心子工程:提供服务注册和发现
├── service-consumer                 #服务消费方（feign模式）子工程：从Eureka注册中心获取注册服务列表，从而能够消费服务
├── service-cosumer-ribbon           #服务消费方（ribbon+restTemplate模式）子工程：从Eureka注册中心获取注册服务列表，从而能够消费服务
├── service-producer                 #服务提供方子工程:将自身服务注册到Eureka中心，从而使服务消费方能够找到
├── service-zuul                     #路由网关子工程：提供路由服务
├── springcloud-config-repo          # GitHub 远程配置仓库
└── pom.xml
```

## 精彩博客
- [走进Spring Cloud之一 微服务和SpringCloud](https://blog.csdn.net/weixin_43430036/article/details/83895597)
- [走进Spring Cloud之二 eureka注册中心](https://blog.csdn.net/weixin_43430036/article/details/83865348)
- [走进Spring Cloud之九 高可用配置中心](https://blog.csdn.net/weixin_43430036/article/details/83900884)
- [走进Spring Cloud之十一 SpringCloud bus 消息总线刷新配置](https://blog.csdn.net/weixin_43430036/article/details/83993919)


## 精彩效果

### 高可用注册中心
![eureka集群](https://img-blog.csdnimg.cn/201811081707428.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzQzMDAzNg==,size_16,color_FFFFFF,t_70)

### 高可用配置中心
![muilt config](https://img-blog.csdnimg.cn/20181110121756231.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzQzMDAzNg==,size_16,color_FFFFFF,t_70)
