Link to download latest spring jar files is mentioned below
http://repo.spring.io/release/org/springframework/spring/

This project contains samples of 
1) creating and wiring beans
2) instantiation and using spring containers.
3) spring integration with hibernate and a sample example
    - employee class which is mapped to employee table
    - example to save employee.
       - service class implementation which contains dao as property used to perform CRUD operations in db.
       - jdbc properties are being read from a properties file and are loaded
       - transaction are being defined using aop in spring config file