# mybatis-playground
mybatis学习游乐场


目录结构：

* `src/main/java/com/supwisdom/mappers`：存放Mybatis的Mapper
* `src/main/resources/mappers`：存放Mapper对应的xml配置文件
* `src/main/resources/db/migration`：存放数据库初始化语句，文件格式按照V{版本号}__{标题}.sql，如果有多个文件，则会按照版本号排序依次执行
* `src/test/java/com/supwisdom/mappers`：存放Mapper的集成测试代码

项目说明：

* 本项目使用H2内存数据库，程序启动时会自动启动，因此不需要额外的数据库配置与安装
* 本项目要求每个Mapper都有对应的测试代码，现已提供了City*相关例子

项目测试：

* `mvn clean integration-test`
