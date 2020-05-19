# 目录

* [内容简介](docs/introduction.md)
* [前言](docs/preface.md)
* [第1章 Java概述](docs/ch01/1.md)
    * [1.1 Java演进史](docs/ch01/1-1.md)
        * 1.1.1 Java简史
        * 1.1.2 Java大有可为
    * [1.2 现代Java新特性:从Java 8到Java 12](docs/ch01/1-2.md)
        * 1.2.1 Java 8新特性
        * 1.2.2 Java 9新特性
        * 1.2.3 Java 10新特性
        * 1.2.4 Java 11新特性
        * 1.2.5 Java 12新特性
    * [1.3 如何来学习本书](docs/ch01/1-3.md)
        * 1.3.1 学习的前置条件
        * 1.3.2 如何使用本书
        * 1.3.3 如何获取源码
    * [1.4 开发环境配置及编写第一个Java应用](docs/ch01/1-4.md)
        * 1.4.1 JDK 12的下载
        * 1.4.2 JDK 12的安装
        * 1.4.3 Eclipse的下载
        * 1.4.4 Eclipse的安装
        * 1.4.5 Eclipse的配置
        * 1.4.6 创建Java应用
        * 1.4.7 创建模块
        * 1.4.8 创建Hello World程序
        * 1.4.9 使用JUnit5
* [第2章 Java语言基础](docs/ch02/2.md)
    * [2.1 变量](docs/ch02/2-1.md)
        * 2.1.1 命名
        * 2.1.2 基本数据类型
        * 2.1.3 基本数据类型的默认值
        * 2.1.4 字面值（Literal）
        * 2.1.5 基本类型之间的转换
        * 2.1.6 数组（Array）
    * [2.2 运算符](docs/ch02/2-2.md)
        * 2.2.1 赋值运算符
        * 2.2.2 算术运算符
        * 2.2.3 一元运算符
        * 2.2.4 等价和关系运算符
        * 2.2.5 条件运算符
        * 2.2.6 instanceof运算符
        * 2.2.7 位运算和位移运算符
    * [2.3 表达式、语句和块](docs/ch02/2-3.md)
        * 2.3.1 表达式
        * 2.3.2 语句
        * 2.3.3 块
    * [2.4 控制流程语句](docs/ch02/2-4.md)
        * 2.4.1 if-then
        * 2.4.2 if-then-else 
        * 2.4.3 switch
        * 2.4.4 while
        * 2.4.5 do-while
        * 2.4.6 for
    * [2.5 枚举类型](docs/ch02/2-5.md)
    * [2.6 泛型](docs/ch02/2-6.md)
        * 2.6.1 泛型的作用
        * 2.6.2 泛型类型
        * 2.6.3 泛型方法
        * 2.6.4 有界类型参数
        * 2.6.5 泛型的继承和子类型
        * 2.6.6 通配符
        * 2.6.7 类型擦除
        * 2.6.8 使用泛型的一些限制
    * [2.7 关键字](docs/ch02/2-7.md)
* [第3章 面向对象编程基础](docs/ch03/3.md)
    * [3.1 编程的抽象](docs/ch03/3-1.md)
    * [3.2 类（Class）的示例](docs/ch03/3-2.md)
    * [3.3 对象的接口（Interface）](docs/ch03/3-3.md)
    * [3.4 包（Package）](docs/ch03/3-4.md)
    * [3.5 对象提供服务](docs/ch03/3-5.md)
    * [3.6 隐藏实现的细节](docs/ch03/3-6.md)
        * 3.6.1 为啥需要控制对成员的访问
        * 3.6.2 Java的作用域
    * [3.7 实现的重用](docs/ch03/3-7.md)
    * [3.8 继承](docs/ch03/3-8.md)
        * 3.8.1 Java中的继承
        * 3.8.2 关于Shape的讨论
        * 3.8.3 实战：继承的示例
    * [3.9 is-a和is-like-a的关系](docs/ch03/3-9.md)
    * [3.10 多态性（Polymorphism）](docs/ch03/3-10.md)
        * 3.10.1 多态的定义
        * 3.10.2 理解多态的好处
* [第4章 集合框架](docs/ch04/4.md)
    * [4.1 集合框架概述](docs/ch04/4-1.md)
        * 4.1.1 集合框架的定义
        * 4.1.2 Java集合框架的优点
        * 4.1.3 集合框架常见的接口
        * 4.1.4 集合框架的实现
    * [4.2 Collection接口](docs/ch04/4-2.md)
        * 4.2.1 遍历集合
        * 4.2.2 集合接口批量操作
    * [4.3 Set接口](docs/ch04/4-3.md)
        * 4.3.1 HashSet、TreeSet和LinkedHashSet的比较
        * 4.3.2 Set接口基本操作
        * 4.3.3 Set接口批量操作
    * [4.4 Map接口](docs/ch04/4-4.md)
        * 4.4.1 Map接口基本操作
        * 4.4.2 Map接口批量操作
        * 4.4.3 Map集合视图
    * [4.5 List接口](docs/ch04/4-5.md)
        * 4.5.1 集合操作
        * 4.5.2 位置访问和搜索操作
        * 4.5.3 List的迭代器
        * 4.5.4 范围视图操作
        * 4.5.5 List常用算法
    * [4.6 Queue接口](docs/ch04/4-6.md)
    * [4.7 Deque接口](docs/ch04/4-7.md)
        * 4.7.1 插入
        * 4.7.2 移除
        * 4.7.3 检索
* [第5章 异常处理](docs/ch05/5.md)
    * [5.1 异常捕获与处理](docs/ch05/5-1.md)
        * 5.1.1 先从一个例子入手
        * 5.1.2 try块
        * 5.1.3 catch块
        * 5.1.4 在一个异常处理程序中处理多个类型的异常
        * 5.1.5 finally块
    * [5.2 通过方法声明异常抛出](docs/ch05/5-2.md)
    * [5.3 如何抛出异常](docs/ch05/5-3.md)
        * 5.3.1 throw语句
        * 5.3.2 Throwable类及其子类
        * 5.3.3 Error类
        * 5.3.4 Exception类
    * [5.4 异常链](docs/ch05/5-4.md)
        * 5.4.1 访问堆栈跟踪信息
        * 5.4.2 记录异常日志
    * [5.5 创建异常类](docs/ch05/5-5.md)
        * 5.5.1 一个创建异常类的例子
        * 5.5.2 选择超类
    * [5.6 未检查异常](docs/ch05/5-6.md)
    * [5.7 使用异常带来的优势](docs/ch05/5-7.md)
        * 5.7.1 将错误处理代码与“常规”代码分离
        * 5.7.2 将错误沿调用推栈向上传递
        * 5.7.3 对错误类型进行分组和区分
    * [5.8 try-with-resources语句](docs/ch05/5-8.md)
        * 5.8.1 手动关闭资源
        * 5.8.2 Java 7中的`try-with-resources`介绍
        * 5.8.3 `try-with-resources`在Java 9中的改进
    * [5.9 实战：使用try-with-resource](docs/ch05/5-9.md)
* [第6章 I/O处理](docs/ch06/6.md)
    * [6.1 I/O流](docs/ch06/6-1.md)
        * 6.1.1 字节流（Byte Streams）
        * 6.1.2 字符流（Character Streams）
        * 6.1.3 面向行的I/O
        * 6.1.4 刷新缓冲流
        * 6.1.5 扫描和格式化文本
        * 6.1.6 命令行I/O
        * 6.1.7 数据流（Data Streams）
        * 6.1.8 对象流（Object Streams）
    * [6.2 文件I/O](docs/ch06/6-2.md)
        * 6.2.1 路径
        * 6.2.2 Path类
        * 6.2.3 Path的操作
        * 6.2.4 文件操作
        * 6.2.5 检查文件或目录
        * 6.2.6 删除文件或目录
        * 6.2.7 复制文件或目录
        * 6.2.8 移动一个文件或目录
* [第7章 网络编程](docs/ch07/7.md)
    * [7.1 网络基础](docs/ch07/7-1.md)
        * 7.1.1 了解OSI参考模型
        * 7.1.2 TCP/IP网络模型与OSI模型的对比
        * 7.1.3 了解TCP
        * 7.1.4 了解UDP
        * 7.1.5 了解端口
    * [7.2 Socket](docs/ch07/7-2.md)
        * 7.2.1 了解Socket
        * 7.2.2 实战：实现一个echo服务器
    * [7.3 I/O模型的演进](docs/ch07/7-3.md)
        * 7.3.1 UNIX I/O模型的基本概念
        * 7.3.2 UNIX I/O模型
        * 7.3.3 常见Java I/O模型
    * [7.4 HTTP Client API概述](docs/ch07/7-4.md)
    * [7.5 HttpRequest](docs/ch07/7-5.md)
    * [7.6 HttpResponse](docs/ch07/7-6.md)
    * [7.7 实战：HTTP Client API的使用例子](docs/ch07/7-7.md)
        * 7.7.1 HTTP Client发起同步请求
        * 7.7.2 发起异步请求
* [第8章 并发编程](docs/ch08/8.md)
    * [8.1 了解线程](docs/ch08/8-1.md)
        * 8.1.1 线程的状态
        * 8.1.2 进程和线程
        * 8.1.3 线程和纤程
        * 8.1.4 Java中的线程对象
        * 8.1.5 实战：多线程示例
    * [8.2 并发编程是把双刃剑](docs/ch08/8-2.md)
        * 8.2.1 死锁（Deadlock）
        * 8.2.2 饥饿（Starvation）
        * 8.2.3 活锁（Livelock）
    * [8.3 解决并发问题的常用方法](docs/ch08/8-3.md)
        * 8.3.1 同步（Synchronization）
        * 8.3.2 原子访问（Atomic Access）
        * 8.3.3 无锁化设计提升并发能力
        * 8.3.4 缓存提升并发能力
        * 8.3.5 更细颗粒度的并发单元
    * [8.4 守卫块（Guarded Blocks）](docs/ch08/8-4.md)
    * [8.5 不可变对象（Immutable Object）](docs/ch08/8-5.md)
        * 8.5.1 一个同步类的例子
        * 8.5.2 定义不可变对象的策略
    * [8.6 高级并发对象](docs/ch08/8-6.md)
        * 8.6.1 锁对象
        * 8.6.2 执行器
        * 8.6.3 并发集合
        * 8.6.4 原子变量
        * 8.6.5 并发随机数
* [第9章 基本编程结构的改进](docs/ch09/9.md)
    * [9.1 直接运行Java源代码](docs/ch09/9-1.md)
        * 9.1.1 Java 11可以执行运行Java源码
        * 9.1.2 原理
    * [9.2 局部变量类型推断](docs/ch09/9-2.md)
        * 9.2.1 了解var声明变量的一些限制
        * 9.2.2 原理
    * [9.3 实战：var关键字的使用](docs/ch09/9-3.md)
    * [9.4 字符串处理增强](docs/ch09/9-4.md)
        * 9.4.1 支持Raw String Literals
        * 9.4.2 原理
        * 9.4.3 限制
        * 9.4.4 Java 11常用String API
        * 9.4.5 Java 12常用String API
    * [9.5 实战：Java 11字符串的使用](docs/ch09/9-5.md) 
        * 9.5.1 Raw String Literals的使用
        * 9.5.2 String API的使用
    * [9.6 支持Unicode标准](docs/ch09/9-6.md)
        * 9.6.1 了解Unicode 10
        * 9.6.2 在控制台打印出Emoji
        * 9.6.3 在GUI中显示出Emoji
    * [9.7 Optional](docs/ch09/9-7.md)
        * 9.7.1 复现NullPointerException
        * 9.7.2 Optional类的魔法
        * 9.7.3 Optional类的其他方法
    * [9.8 接口中的默认方法](docs/ch09/9-8.md)
    * [9.9 实战：接口中的默认方法的使用](docs/ch09/9-9.md)
    * [9.10 接口中的静态方法](docs/ch09/9-10.md)
    * [9.11 实战：接口中的静态方法的使用](docs/ch09/9-11.md)
    * [9.12 Switch表达式增强](docs/ch09/9-12.md)
        * 9.12.1 实战：Switch表达式的例子
        * 9.12.2 使用Switch表达式的注意事项
    * [9.13 紧凑数字格式](docs/ch09/9-13.md)
* [第10章 垃圾回收器的增强](docs/ch10/10.md)
    * [10.1 了解G1](docs/ch10/10-1.md)
        * 10.1.1 了解Java垃圾回收机制
        * 10.1.2 查找不再使用的对象
        * 10.1.3 垃圾回收算法
        * 10.1.4 分代垃圾回收
        * 10.1.5 Java垃圾回收器的历史
        * 10.1.6 了解G1的原理
        * 10.1.7 了解G1 Young GC
        * 10.1.8 了解G1 Mixed GC
    * [10.2 了解ZGC](docs/ch10/10-2.md)
        * 10.2.1 更短的停顿
        * 10.2.2 ZGC的着色指针和读屏障
        * 10.2.3 读屏障
        * 10.2.4 GC工作原理
    * [10.3 了解Epsilon](docs/ch10/10-3.md)
    * [10.4 了解Shenandoah](docs/ch10/10-4.md)
        * 10.4.1 Shenandoah工作原理
        * 10.4.2 性能指标
* [第11章 使用脚本语言](docs/ch11/11.md)
    * [11.1 什么是JShell](docs/ch11/11-1.md)
    * [11.2 为什么需要JShell](docs/ch11/11-2.md)
    * [11.3 JShell的基本操作](docs/ch11/11-3.md)
        * 11.3.1 启动JShell
        * 11.3.2 退出JShell
        * 11.3.3 使用JShell测试API
        * 11.3.4 使用JShell操作流
        * 11.3.5 获取帮助
    * [11.4 实战：JShell的综合用法](docs/ch11/11-4.md)
        * 11.4.1 定义方法
        * 11.4.2 使用自定义的方法
        * 11.4.3 查看所有的变量及引用情况
        * 11.4.4 保存历史
        * 11.4.5 打开文件
        * 11.4.6 获取变量的引用值
* [第12章 lambda表达式及函数式编程](docs/ch12/12.md)
    * [12.1 lambda表达式](docs/ch12/12-1.md)
        * 12.1.1 第一个lambda表达式的例子
        * 12.1.2 第二个lambda表达式的例子
        * 12.1.3 lambda表达式简写的依据
    * [12.2 方法引用](docs/ch12/12-2.md)
        * 12.2.1 什么是方法引用
        * 12.2.2 实战：方法引用的例子
    * [12.3 构造函数引用](docs/ch12/12-3.md)
    * [12.4 函数式接口](docs/ch12/12-4.md)
        * 12.4.1 Predicate
        * 12.4.2 Consumer
        * 12.4.3 Function
        * 12.4.4 总结
    * [12.5 Consumer接口](docs/ch12/12-5.md)
        * 12.5.1 andThen
        * 12.5.2 IntConsumer
        * 12.5.3 LongConsumer
        * 12.5.4 DoubleConsumer
        * 12.5.5 BiConsumer
    * [12.6 Supplier接口](docs/ch12/12-6.md)
        * 12.6.1 get
        * 12.6.2 BooleanSupplier
        * 12.6.3 IntSupplier
        * 12.6.4 LongSupplier
        * 12.6.5 DoubleSupplier
    * [12.7 Predicate接口](docs/ch12/12-7.md)
        * 12.7.1 test
        * 12.7.2 negate
        * 12.7.3 or
        * 12.7.4 and
        * 12.7.5 not
        * 12.7.6 IntPredicate
        * 12.7.7 BiPredicate
    * [12.8 Function接口](docs/ch12/12-8.md)
        * 12.8.1 compose
        * 12.8.2 andThen
        * 12.8.3 identity
    * [12.9 类型检查](docs/ch12/12-9.md)
    * [12.10 类型推导](docs/ch12/12-10.md)
    * [12.11 使用本地变量](docs/ch12/12-11.md)
* [第13章 Stream](docs/ch13/13.md)
    * [13.1 Stream API概述](docs/ch13/13-1.md)
        * 13.1.1 什么是聚合操作
        * 13.1.2 什么是Stream
        * 13.1.3 Stream的构成
    * [13.2 实例：Stream使用例子](docs/ch13/13-2.md)
        * 13.2.1 传统的过滤数据的做法
        * 13.2.2 Stream过滤数据的做法
    * [13.3 Stream与集合的异同点](docs/ch13/13-3.md)
    * [13.4 Stream常用操作](docs/ch13/13-4.md)
        * 13.4.1 collect(toList())终止操作
        * 13.4.2 map中间操作
        * 13.4.3 filter中间操作
        * 13.4.4 count终止操作
        * 13.4.5 min终止操作
        * 13.4.6 max终止操作
        * 13.4.7 reduce终止操作
    * [13.5 过滤数据](docs/ch13/13-5.md)
    * [13.6 切分数据](docs/ch13/13-6.md)
        * 13.6.1 使用Predicate切分数据
        * 13.6.2 截断Stream
        * 13.6.3 跳过元素
    * [13.7 映射](docs/ch13/13-7.md)
        * 13.7.1 map
        * 13.7.2 flatMap
    * [13.8 查找和匹配](docs/ch13/13-8.md)
        * 13.8.1 allMatch
        * 13.8.2 anyMatch
        * 13.8.3 noneMatch
        * 13.8.4 findFirst
        * 13.8.5 findAny
    * [13.9 压缩数据](docs/ch13/13-9.md)
        * 13.9.1 计算总和
        * 13.9.2 计算最大值和最小值
    * [13.10 构造Stream](docs/ch13/13-10.md)
        * 13.10.1 从值中构造
        * 13.10.2 从nullable中构造
        * 13.10.3 从数组中构造
        * 13.10.4 从集合中构造
        * 13.10.5 从文件中构造
    * [13.11 收集收据](docs/ch13/13-11.md)
        * 13.11.1 Collector接口
        * 13.11.2 Collectors
        * 13.11.3 统计总数
        * 13.11.4 计算最大值和最小值
        * 13.11.5 求和
        * 13.11.6 求平均数
        * 13.11.7 连接字符串
        * 13.11.8 分组
        * 13.11.9 分区
    * [13.12 并行计算](docs/ch13/13-12.md)
        * 13.12.1 并行流
        * 13.12.2 stream与parallelStream的抉择
    * [13.13 Spliterator接口](docs/ch13/13-13.md)
* [第14章 集合的增强](docs/ch14/14.md)
    * [14.1 集合工厂](docs/ch14/14-1.md)
        * 14.1.1 List工厂
        * 14.1.2 Set工厂
        * 14.1.3 Map工厂
    * [14.2 实战：List工厂的使用](docs/ch14/14-2.md)
    * [14.3 实战：Set工厂的使用](docs/ch14/14-3.md)
    * [14.4 实战：Map工厂的使用](docs/ch14/14-4.md)
    * [14.5 List和Set常用方法](docs/ch14/14-5.md)
        * 14.5.1 removeIf
        * 14.5.2 replaceAll
    * [14.6 实战：removeIf方法的使用](docs/ch14/14-6.md)
    * [14.7 实战：replaceAll方法的使用](docs/ch14/14-7.md)
    * [14.8 Map常用方法](docs/ch14/14-8.md)
        * 14.8.1 forEach
        * 14.8.2 sorted
        * 14.8.3 getOrDefault
    * [14.9 实战：forEach方法的使用](docs/ch14/14-9.md)
    * [14.10 实战：排序的使用](docs/ch14/14-10.md)
    * [14.11 实战：getOrDefault的使用](docs/ch14/14-11.md)
    * [14.12 实战：计算操作](docs/ch14/14-12.md)
        * 14.12.1 computeIfAbsent
        * 14.12.2 computeIfPresent
        * 14.12.3 compute
    * [14.13 实战：移除操作](docs/ch14/14-13.md)
        * 14.14.1 replaceAll
        * 14.14.2 replace
    * [14.14 实战：替换操作](docs/ch14/14-14.md)
    * [14.15 实战：合并操作](docs/ch14/14-15.md)
    * [14.16 ConcurrentHashMap的改进](docs/ch14/14-16.md)
        * 14.16.1 Java 8之前的ConcurrentHashMap类
        * 14.16.2 Java 8之后的ConcurrentHashMap类的改进
* [第15章 新的日期和时间API](docs/ch15/15.md)
    * [15.1 了解LocalDate](docs/ch15/15-1.md)
    * [15.2 了解LocalTime](docs/ch15/15-2.md)
    * [15.3 了解LocalDateTime](docs/ch15/15-3.md)
    * [15.4 了解Instant](docs/ch15/15-4.md)
    * [15.5 了解Duration](docs/ch15/15-5.md)
    * [15.6 了解Period](docs/ch15/15-6.md)
    * [15.7 常用日期的操作](docs/ch15/15-7.md)
    * [15.8 调整时间](docs/ch15/15-8.md)
    * [15.9 格式化日期](docs/ch15/15-9.md)
    * [15.10 时区处理](docs/ch15/15-10.md)
    * [15.11 日历](docs/ch15/15-11.md)
* [第16章 并发编程的增强](docs/ch16/16.md)
    * [16.1 Stream的parallel()方法](docs/ch16/16-1.md)
    * [16.2 执行器及线程池](docs/ch16/16-2.md)
        * 16.2.1 线程及线程数
        * 16.2.2 线程池
        * 16.2.3 Java 8中的Executors增强
        * 16.2.4 了解线程池的的风险
    * [16.3 Future API](docs/ch16/16-3.md)
        * 16.3.1 并行提交任务
        * 16.3.2 顺序返回结果
    * [16.4 CompletableFuture](docs/ch16/16-4.md)
        * 16.4.1 CompletionStage
        * 16.4.2 CompletableFuture
        * 16.4.3 CompletableFuture类使用示例
    * [16.5 异步API中的异常处理](docs/ch16/16-5.md)
    * [16.6 box-and-channel模型](docs/ch16/16-6.md)
    * [16.7 实例：在线商城](docs/ch16/16-7.md)
    * [16.8 实例：同步方法转为异步](docs/ch16/16-8.md)
        * 16.8.1 异常处理
        * 16.8.2 使用supplyAsync简化代码
* [第17章 模块化（Jigsaw）](docs/ch17/17.md)
    * [17.1 为什么需要模块化](docs/ch17/17-1.md)
        * 17.1.1 体积大
        * 17.1.2 访问控制粒度不够细
        * 17.1.3 依赖地狱
    * [17.2 用模块化开发和设计Java应用](docs/ch17/17-2.md)
        * 17.2.1 模块的声明
        * 17.2.2 模块的零件
        * 17.2.3 模块描述
        * 17.2.4 平台模块
* [第18章 响应式编程](docs/ch18/18.md)
    * [18.1 响应式编程概述](docs/ch18/18-1.md)
        * 18.1.1 Flow Control的几种方案
        * 18.1.2 Pull、Push与Pull-Push
        * 18.1.3 Flow API与Stream API
    * [18.2 Flow API](docs/ch18/18-2.md)
        * 18.2.1 订阅者Subscriber
        * 18.2.2 Subscriber示例
        * 18.2.3 发布者Publisher
        * 18.2.4 订阅Subscription
        * 18.2.5 处理器Processor
    * [18.3 实战：响应式编程综合示例](docs/ch18/18-3.md)
        * 18.3.1 定义Subscriber
        * 18.3.2 定义Publisher
        * 18.3.3 运行应用
* [参考文献](docs/references.md)

