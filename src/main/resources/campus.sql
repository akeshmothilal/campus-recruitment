create database campussystem;
create table student_info(
id bigint primary key auto_increment,
user_name varchar(50),
gender varchar(10),
dateOfBirth date,
college varchar(50),
course varchar(10),
percentage bigint,
user_password varchar(10),
email  varchar(50),
role  varchar(50),
contact_no bigint

);
drop table student_info;
select * from student_info order by percentage desc;
insert into student_info(user_name, gender, dateOfBirth, college, course, percentage, role , user_password, email  , contact_no)values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);
create table company_info(
id bigint auto_increment primary key,
company_name varchar(50),
company_type  varchar(50),
headquarters varchar(50),
email varchar(50),
company_password varchar(50)
);

delete from student_info where id =5;

insert into company_info (company_name, company_type, headquarters, email, company_password ) values (?, ?, ?, ?, ?);

select * from  company_info;
drop table  company_info;
	delete from company_info where id =5;
create table job_posting(

id bigint auto_increment primary key,
job_title varchar(50),
job_description varchar(50),
college_location varchar(50),
interview_date date,
salary double,
company_id bigint,
foreign key(company_id) references company_info(id)
);
select * from  job_posting;

drop table job_posting;

insert into job_posting(job_title, job_description,  college_location, salary, company_id) values("data scientist","you should have analtical skill","MIT chennai",4566.00,1);

select c.company_name, j.job_title,j.job_description, c.email, j.college_location from company_info c, job_posting j where c.id=j.company_id;
delete  from job_posting where id >1;

select c.company_name, j.job_title,j.job_description, c.email, j.college_location , j.interview_date,j.id as job_id from company_info c, job_posting  j where c.id=j.company_id order by j.interview_date desc;


create table application(
id bigint auto_increment primary key,
apply_status boolean,
student_id bigint ,
foreign key(student_id) references student_info(id),
job_id bigint,
foreign key(job_id) references job_posting(id)

) ;


insert into application(apply_status, student_id , job_id) values(true,1,1);
select * from application ;
delete from application where id>5;

delete from application where id = 5;
select j.job_title ,a.id as applyid , c.company_name, j.college_location from company_info c, job_posting j, application a where c.id = j.company_id and j.id= a.job_id and a.student_id =3 ;

drop table application;


create table admin(
id bigint auto_increment primary key,
admin_name varchar(50),
admin_password varchar(50)

);
insert into admin(admin_name, admin_password) values ("Akesh",123);
select * from admin;



select j.job_title ,s.user_name , c.company_name from job_posting j, company_info c, application a, student_info s where j.company_id = c.id and j.id = a.job_id and a.student_id = s.id and j.company_id = 7;

select j.job_title ,s.user_name , c.company_name from job_posting j  join company_info c on j.company_id = c.id join application a on j.id = a.job_id join student_info s on a.student_id = s.id where j.company_id = 7;
select j.job_title ,s.user_name , c.company_name,s.id as student_id from job_posting j, company_info c, application a, student_info s where j.company_id = c.id and j.id = a.job_id and a.student_id = s.id and j.company_id = 7;
