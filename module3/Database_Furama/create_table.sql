create database if not exists database_furama;
use database_furama;
create table `position`(
position_id int auto_increment primary key,
position_name varchar(45)
);
create table education_degree(
education_degree_id int auto_increment primary key,
education_degree_name varchar(45)
);
create table division(
division_id int auto_increment primary key,
division_name varchar(45)
);
create table `role`(
role_id int auto_increment primary key,
role_name varchar(225)
);
create table `user`(
username varchar(225) primary key,
`password` varchar(225)
);
create table user_role(
role_id int ,foreign key (role_id) references `role`(role_id) on delete cascade,
username varchar(225) ,foreign key (username) references `user`(username) on delete cascade
);
create table employee(
employee_id int auto_increment primary key,
employee_name varchar(45),
employee_birthday date,
employee_id_card varchar(45),
employee_salary double,
employee_phone varchar(45),
employee_email varchar(45),
employee_address varchar(45),
position_id int,foreign key(position_id) references `position`(position_id) on delete cascade,
education_degree_id int,foreign key(education_degree_id) references education_degree(education_degree_id) on delete cascade,
division_id int,foreign key (division_id) references division (division_id) on delete cascade,
username varchar(225),foreign key(username) references `user`(username) on delete cascade
);
create table customer_type(
customer_type_id int auto_increment primary key,
customer_type_name varchar(45)
);
create table customer(
customer_id int auto_increment primary key,
customer_type_id int,foreign key (customer_type_id) references customer_type(customer_type_id) on delete cascade,
customer_name varchar(45),
customer_birthday date,
customer_gender varchar(20),
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_address varchar(45)
);
create table service_type(
service_type_id int auto_increment primary key,
service_type_name varchar(45)
);
create table rent_type(
rent_type_id int auto_increment primary key,
rent_type_name varchar(45),
rent_type_cost double
);
create table service(
service_id int auto_increment primary key,
service_name varchar(45),
service_area int,
service_cost double,
service_max_people int,
rent_type_id int,foreign key (rent_type_id) references rent_type(rent_type_id) on delete cascade,
service_type_id int,foreign key (service_type_id) references service_type(service_type_id) on delete cascade,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floor int
);
create table attach_service(
attach_service_id int auto_increment primary key,
attach_service_name varchar(45),
attach_service_cost double,
attach_service_unit int,
attach_service_status varchar(45)
);
create table contract(
contract_id int auto_increment primary key,
contract_start_date date,
contract_end_date date,
contract_deposit double,
contract_totle_money double,
employee_id int,foreign key (employee_id) references employee(employee_id) on delete cascade,
customer_id int,foreign key (customer_id) references customer(customer_id) on delete cascade,
service_id int,foreign key (service_id) references service(service_id) on delete cascade
);
create table contract_detail(
contract_detail_id int auto_increment primary key,
contract_id int,foreign key(contract_id) references contract(contract_id) on delete cascade,
attach_service_id int,foreign key (attach_service_id) references attach_service(attach_service_id) on delete cascade,
quantity int
);


drop view if exists customer_using_service;
create view customer_using_service as
select cus.customer_id,cus.customer_name,cus.customer_phone,
con.contract_id,con.contract_start_date,con.contract_end_date,
ser.service_name
from contract con
left join customer cus on con.customer_id = cus.customer_id
left join service ser on con.service_id = ser.service_id
where now() between con.contract_start_date and con.contract_end_date
group by cus.customer_id;

select * from customer_using_service;
delete from customer_using_service
where customer_id = 5;

create view show_attach_service as
select att.attach_service_id,att.attach_service_name,con.contract_id,cd.quantity
from attach_service att 
join contract_detail cd on att.attach_service_id = cd.attach_service_id
join contract con on cd.contract_id = con.contract_id;

select * from show_attach_service;

select * from customer_using_service
where customer_name like "%e%";




