create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
customer_id int auto_increment not null primary key,
customer_name varchar(40),
customer_age varchar(20)
);
create table `order`(
order_id int auto_increment not null primary key,
customer_id int not null,foreign key(customer_id) references customer(customer_id),
order_date date,
order_total_price float
);
create table product(
product_id int auto_increment not null primary key,
product_name varchar(45),
product_price float
);
create table orderdetail(
order_detail_id int not null,foreign key(order_detail_id) references `order`(order_id),
product_id int not null,foreign key(product_id) references product(product_id),
OrderDetailQTY varchar(45),
primary key (order_detail_id,product_id)
);