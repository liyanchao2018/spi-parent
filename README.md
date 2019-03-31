# spi-parent
SPI项目总工程师，内含SPI接口发布方和SPI接口实现方，每一方都是相同层级结构，下载到idea中要分别打开多个项目;
这里面包含三个工程：spi-basedatadriver；spi-mysqldriver；spi-oracledriver；

spi-basedatadriver；spi-mysqldriver；spi-oracledriver；
这三个项目 需要分别添加到idea中，来体现出 interface发布，具体厂商对其SPI插件的实现；
但是，同时添加到一个idea工程中也无妨，需要做以下操作：
1.spi-basedatadriver maven install；
2.spi-mysqldriver maven install；
3.spi-oracledriver maven install；

最后，通过 dubbo-first项目中的 dubbo-provider中 的DataBaseConnection.java 的main 方法，执行来表示 SPI插件开发的实现结果；
执行结果：两个SPI实现工程 都调用了一遍；
```java 
begin build MYSQL connection
begin build ORACLE connection
```
