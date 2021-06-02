create database demo;
use demo;

create table users (
id int(3) not null auto_increment,
name varchar(120) not null,
email varchar(220) not null,
country varchar(120),
primary key (id)
);

insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');

select * from users;
insert into users(name, email, country) values('Toanababab','kante@che.uk','Kenia');
select * from users
order by name;

select * from users
where country like "%am%";

select * from users;

DELIMITER //

CREATE PROCEDURE get_user_by_id(IN user_id INT)

BEGIN

    SELECT users.name, users.email, users.country

    FROM users

    where users.id = user_id;

    END//

DELIMITER ;

DELIMITER //

CREATE PROCEDURE insert_user(

IN user_name varchar(50),

IN user_email varchar(50),

IN user_country varchar(50)

)

BEGIN

    INSERT INTO users(name, email, country) VALUES(user_name, user_email, user_country);

    END//

DELIMITER ;


drop table users;

create table Permision(

id int(11) primary key,

name varchar(50)

);

 

create table User_Permision(

permision_id int(11),

user_id int(11)

);

insert into Permision(id, name) values(1, 'add');

insert into Permision(id, name) values(2, 'edit');

insert into Permision(id, name) values(3, 'delete');

insert into Permision(id, name) values(4, 'view');

DELIMITER //

CREATE PROCEDURE get_all_user()

BEGIN

    SELECT *

    FROM users;

END//

DELIMITER ;
call get_all_user();

DELIMITER //

CREATE PROCEDURE update_user(
in id_in int,
IN name_in varchar(50),

IN email_in varchar(50),

IN country_in varchar(50)
)

BEGIN

    update users
    set `name` = name_in,
    email = email_in,
    country = country_in
    where id = id_in;

END//

DELIMITER ;
call update_user(2,"toan","toan@gmail","da nang");


DELIMITER //

CREATE PROCEDURE delete_user(in id_in int)

BEGIN

    delete from users
    where id = id_in;

END//

DELIMITER ;
call delete_user(?);