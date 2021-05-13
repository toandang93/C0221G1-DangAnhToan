create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
CustomerID int auto_increment not null primary key,
CustomerName varchar(40),
CustomerAge varchar(20)
);
create table `order`(
OrderID int auto_increment not null primary key,
CustomerID int not null,foreign key(CustomerID) references customer(CustomerID),
OrderDate date,
OrderTotalPrice float
);
create table product(
ProductID int auto_increment not null primary key,
ProductName varchar(45),
ProductPrice float
);
create table orderdetail(
OrderID int not null,foreign key(OrderID) references `order`(OrderID),
ProductID int not null,foreign key(ProductID) references product(ProductID),
OrderDetailQTY varchar(45)
);