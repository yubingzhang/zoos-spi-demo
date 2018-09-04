## Java SPI的作用  ##

SPI 全称为 (Service Provider Interface) ，是JDK内置的一种服务提供发现机制。
SPI是一种动态替换发现的机制， 比如有个接口，想运行时动态的给它添加实现，你只需要添加一个实现。从而使接口提供方和现实方解耦。


## 项目结构说明 ##

- **zoos-spi-demo**  
作为父项目，包含下面的子项目
- **zoo-base**  
提供需要外部实现的接口，实现外部实现类的加载，注册功能
- **zoo-skill-fly**  
spi接口实现类，调用*zoo-base*的注册功能，在*resources/META-INF/services*目录下添加实现类的配置
- **zoo-skill-swin**  
spi接口实现类，调用*zoo-base*的注册功能，在*resources/META-INF/services*目录下添加实现类的配置
- **zoo-skill-test**  
测试spi功能是否成功
