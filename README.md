## Infrastructure of Spring framework


![Spring Architecture](./images/spring-modules.png)
* **AOP (Aspect Oriented Programming):** Adds functionality to the objects declarativly such as Logging, security transactions etc. 

* **Instrumentations:** Makes use of class loader implementations to make use of different app services.

<br/><br/>
## Install Tomcat for mac os mojave or linux system 
* **STEP 1:** Download Tomcat tar.gz 
* **STEP 2:** Untar the tar file. 
* **STEP 3:** Move the folder to /usr/local/ directory 
### `sudo mv apache-tomcat-9.0.21 /usr/local/`
* **STEP 4:** Create a soft link to make the installed version of tomcat easy to update, we create a Tomcat folder in Library directory by following command. 
### `sudo mkdir /Library/Tomcat/`
And then we create a soft link from /usr/local/apache-tomcat-9.0.21 to /Library/Tomcat/ directory by following command. 
### `sudo ls -s /usr/local/apache-tomcat-9.0.21 /Library/Tomcat`
(Make sure to put the absolute path while making the soft link)

* **STEP 5:** Add execute permission to the .sh file present inside the bin derectory of the apache-tomcat-x.x.xx package
### `sudo chmod +x /Library/Tomcat/apache-tomcat-9.0.21/bin/*.sh`

* **STEP 5:** Check the link localhost:8080 

<br/><br/>
## Installing Tomcat to Eclipse
1. Start eclipse ee IDE.
2. Go to servers.
3. Select Tomcat server version 9.0 from the list. 
4. Browse the location of the Tomcat server from the root directory.
5. Click on Finish





