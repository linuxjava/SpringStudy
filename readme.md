# 基础内容
- day01_01spring_xml:
  spring的Ioc核心容器讲解，包括ApplicationContext和BeanFactory

- day01_02spring_bean:
spring对bean的管理细节
1.创建bean的三种方式
2.bean对象的作用范围
3.bean对象的生命周期

- day01_03spring_di:
spring中的依赖注入

# IOC
- day02_01spring_ioc_anno
ioc注解实现，基本注解字段解释说明(无数据库访问)

- day02_02spring_ioc_xml
ioc xml实现（使用commons-dbutils中的QueryRunner访问数据库）

- day02_03spring_ioc_xml_anno
XML和注解一起ioc实现,在day02_02spring_ioc_xml基础上将部分类采用注解实现（使用commons-dbutils中的QueryRunner访问数据库）

- day02_04spring_ioc_all_anno
在day02_03spring_ioc_xml_anno基础完全使用注解实现

# AOP
- day03_01spring_aop_account
0.注解加载bean.xml
1.演示是非事务的银行转账中会产生问题
2.使用自定义事务解决问题
3.最后引出aop，为后面做铺垫

- day03_02spring_aop_xml
使用xml方式对aop所有知识讲解

- day03_03spring_aop_annotation
使用半注解方式对aop所有知识讲解

- day03_04spring_aop_all_annotation
0.注解加载配置类(无bean.xml)
1.使用全注解方式实现aop

# Jdbctemplate
- day04_01spring_jdbctemplate
jdbctemplate使用起步

- day04_02spring_jdbctemplate_crud
jdbctemplate实现ioc、CRUD

- day04_03spring_jdbctemplate_custom_dao
自定义实现DaoSupport(支持xml和注解)

- day04_04spring_jdbctemplate_JdbcDaoSupport
使用spring提供的JdbcDaoSupport(只支持xml)

# TX
## 自定义事务
- day04_05spring_custom_tx_xml
基于day03_01spring_account基础上，自定义事务，采用xml配置方式解决转账问题

- day04_06spring_custom_tx_anno
基于day04_05spring_aop_tx基础上，自定义事务，采用注解配置方式解决转账问题

## Spring事务
- day04_07spring_tx_base
spring事务的基础准备module

- day04_08spring_tx_xml
day04_07spring_tx_base基础上进行xml方式事务开发

- day04_09spring_tx_anno_xml
day04_08spring_tx_xml基础上注解和xml混合方式事务开发






















