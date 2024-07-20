# SpringDataJPAExample_MySQL


- MySQL

```
mysql> CREATE DATABASE `TestDB`;
mysql > use TestB;
mysql> CREATE TABLE `Employee` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(20) DEFAULT NULL,
    `role` varchar(20) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
mysql> insert into `Employee` (
  `name` ,
  `role` 
) values ("アリス", "社長"), ("スーパー", "部長");
```

- pom.xml

```
		<!-- add -->		
		<dependency>
		      <groupId>jakarta.persistence</groupId>
		      <artifactId>jakarta.persistence-api</artifactId>
		</dependency>
		<!-- add end -->	
```
