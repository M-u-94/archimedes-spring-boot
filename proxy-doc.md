# 动态代理
## 思路
1. 生成代理类，针对IMapper接口生成代理，使用动态代理
2. 把代理类注入到spring容器中，使用FactoryBean
3. 如何把所有的代理类注入到容器呢，使用ConfigurableListableBeanFactory的registerBean方法，
通过迭代mapper列表，循环注入【mybatis是不是这样的？为啥不直接注入代理类就行了，还需要多一层factoryBean呢】