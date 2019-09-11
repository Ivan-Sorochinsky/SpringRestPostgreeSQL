CREATE TABLE IF NOT EXISTS customers(
    id int PRIMARY KEY,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    address varchar(500) not null
);