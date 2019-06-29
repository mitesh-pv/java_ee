# Getting Started with spring project

**Spring object factory:** Based on the configuration, Spring object factory returns the object of required class.

## Functions of Spring container
* Inversion of control(IoC): Create object and manage it.
* Dependency Injection: Inject object dependency

## Ways of configuring Spring Container
Spring container can be configured in 3 ways: 
* XML configuration file
* Java annotation
* Java source code

## Steps to create spring object
1. Configure the spring beans.
```XML
<beans>
  <bean id="vehicle" class="com.spring.spring_getting_started_2.Bike"
        </beans>
```

2. Create a spring container.
3. Retrieve the beans from the container.

