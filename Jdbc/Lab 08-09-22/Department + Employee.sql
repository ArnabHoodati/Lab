use arnabdb;
create table department( 
Department_ID int Primary Key,
Department_Name Varchar(25),
Department_Head Varchar(25),
Department_Description Varchar(100)
);

Create table employee(
Employee_Id int,
Employee_Name Varchar(35),
Employee_Salary int,
Employee_Contact_No long,
Employee_Address Varchar(50),
Department_ID varchar (50)
);

select * from department;
select * from employee;
