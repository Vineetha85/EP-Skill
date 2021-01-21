show databases;
use world;
create table employee(ename char(20),eid int,age int,dept char(10),designation char(20),salary double,dob varchar(20));
insert into employee values("sai",001,25,"cse","Professor",80000,"05-04-2000");
insert into employee values("Ram",002,24,"mech","Asst.Professor",60000,"09-05-2000");
insert into employee values("Laxman",003,28,"cse","Asst.Professor",60000,"15-08-2000");
insert into employee values("Ravi",004,30,"eee","Professor",80000,"13-11-2000");
insert into employee values("kriti",005,28,"ece","Professor",80000,"01-06-2000");
select * from employee;
delete from employee where eid=003;
UPDATE employee
SET salary = 50000
WHERE eid=005;
alter table employee add(address char(30));