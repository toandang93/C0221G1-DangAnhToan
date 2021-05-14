create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
customer_id int primary key,
customer_name varchar(40),
customer_age varchar(20)
);

create table `order`(
order_id int primary key,
customer_id int ,
order_date date,
order_total_price float,
foreign key(customer_id) references customer(customer_id)
);

create table product(
product_id int primary key,
product_name varchar(45),
product_price float
);

create table order_detail(
order_id int,
product_id int,
order_detail_QTY varchar(45),
primary key (order_id,product_id),
foreign key(order_id) references `order`(order_id),
foreign key(product_id) references product(product_id)
);