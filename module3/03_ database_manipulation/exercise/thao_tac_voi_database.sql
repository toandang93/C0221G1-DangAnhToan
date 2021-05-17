use quan_ly_ban_hang;

insert into customer
values (1,"Minh Quan",10),
(2,"Ngoc Oanh",20),
(3,"Hong Ha",50);

insert into `order`
values (1,1,"2006/3/21",null),
(2,2,"2006/3/23",null),
(3,1,"2006/3/15",null);

insert into product
values (1,"May Giat",3),
(2,"Tu Lanh",5),
(3,"Dieu Hoa",7),
(4,"Quat",1),
(5,"Bep Dien",2);

insert into order_detail
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, pPrice của tất cả các hóa đơn trong bảng Order
select o.order_id,o.order_date,p.product_price
from `order` o join order_detail od on o.order_id= od.order_id
join product p on od.product_id = p.product_id;

-- cach 2
select o.order_id,o.order_date,p.product_price 
from `order` o, order_detail od,product p
where o.order_id= od.order_id and od.product_id = p.product_id;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.customer_name,product.product_name,product.product_price
from customer join `order`
on customer.customer_id = `order`.customer_id
join order_detail on `order`.order_id = order_detail.order_id
join product on order_detail.product_id= product.product_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select c.customer_name 
from customer c left join `order` o
on c.customer_id=o.customer_id
where o.order_id is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
-- Giá bán của từng loại được tính = odQTY*pPrice)
select o.order_id,o.order_date,sum(od.order_detail_QTY*p.product_price) as price
from `order` o,order_detail od,product p
where o.order_id = od.order_id and od.product_id = p.product_id
group by o.order_id



