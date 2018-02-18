# spring boot starting using STS
- new Project -> spring starter project 
	-  select dependencies(web, mysql, jpa) 
- add dependencies manually in pom.xml
		- embed-tomcat, devtools and jstl
		
- Add database configuration for mysql
	 driverclass, url, username and password
- jsp prefix and suffix details

- create a controller and respective jsp
- create folder webapp/WEB-INF inside main folder and create home.jsp in it.
- create user model, UserRepo etc and update the controller
- add below annotation to the Springboot application class
	@EnableJpaRepositories({"in.bonakula.mdemo.model", "in.bonakula.mdemo.repository"})
- then Run 
	- run class MdemoApplication as Java application 


## notes:
- Make user you implement Serializable for all domain objects	
 

 ######### TODO ################
 Implement CRUD functionality based on Model fields 
 
 