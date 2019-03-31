# spi-databasedriver
主要介绍SPI的使用方式及配置形式；
>在dubbo-first项目中，会引用SPI项目示例；
>在dubbo-first项目中，dubbo-provider里，DataBaseConnection类，可以通过main方法，执行run查看MySQLDriver和OracleDriver实现的BaseDataDriver的插件SPI；

##### ``spi-databasedriver``有两个实现SPI的插件服务:``spi-mysqldriver`` 和 ``spi-oracledriver``;

下载下来,可以参考以下代码的写法;

>  ``spi-databasedriver`` ,   ``spi-mysqldriver`` ,  ``spi-oracledriver`` 项目属于同级项目,

>  ``spi-mysqldriver`` ,  ``spi-oracledriver`` 是 ``spi-databasedriver`` 的不同实现;