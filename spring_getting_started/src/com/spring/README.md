# Spring project

1. Plain old java object implementation

2. Spring Inversion of Control

3. Dependency injection
  
There are several types of dependency injection techniques. 
- Constructor injection
- Setter injection

**Steps to create the dependency using constructor method.** 
1. Defining the dependency inerface and class.

```java
// Servicing.java
public interface Servicing{
  public String getVehicleForServicing();
}

// VehicleServicing.java
public class VehicleServicing implements Servicing{
  public String getVehicleForServicing(){
    return "your vehicle has been serviced";
  }
}
```
2. Create constructor.

```java
public class Car implements Vehicle{
  private VehicleServicing vehicleServicing; 
  
  public Car(VehicleServicing vehicleServicing){
    this.vehicleServicing=vehicleServicing;
  }
}
```

3. Configure dependency injection in the spring configuration file.

```xml
 <bean id="vehicle" 
  		class="com.spring.spring_getting_started_2.Car">
  <constructor-arg ref="servicing" />
 </bean>

  <bean id="servicing" 
  		class="com.spring.spring_getting_started_2.VehicleServicing"> 
 </bean>
```

**Steps to create dependency using setter method.**

Inject the deoendencies by using setter methods of the class.

1. Create setter method. 

```java
public class Bus implements Vehicle{
  private VehicleServicing vehicleServicing;
  
  public Bus(){
  }
  
  public void setVehicleServicing(VehicleServicing vehicleServicing){
    this.vehicleServicing=vehicleServicing;
  }
}
```

2. Configure dependency injection in spring configuration file.

```xml
<bean id="vehicle_2" 
  		class="com.spring.spring_getting_started_3.Car">
  		<property name="vehicleServicing" ref="vehicleService">
</bean>
<bean id="vehicleService"
  		class="com.spring.spring_getting_started_3.VehicleServicing">
</bean>
```

