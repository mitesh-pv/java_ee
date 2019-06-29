# Spring project

1. The first part contains plain old java object implementation

2. The second part contains Spring Inversion of Control

3. The third part contains Dependency injection
  
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
