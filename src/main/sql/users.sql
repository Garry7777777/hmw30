CREATE TABLE users (
    username varchar(50) primary key,
    password varchar(250),
    enabled int
);
CREATE TABLE authorities (
    username varchar(50) references users,
    authority varchar(50)
);

insert into users (username, password, enabled) values ('Ann','{bcrypt}$2a$10$vuEx2timDtfP.XLPGKnK2u2IeD1OkdUAFVB/QttiJp90PzZtFud3O', 1);
insert into authorities (username, authority) values ('Ann','ROLE_Employee');

insert into users (username, password, enabled) values ('Bob','{bcrypt}$2a$10$s7Aw5CyvxBb.ufTJSrf1HOEAtcHr1CTBMaLUYQS4XemGMoMKN6FsK', 1);
insert into authorities (username, authority) values ('Bob','ROLE_IT');

insert into users (username, password, enabled) values ('Cate','{bcrypt}$2a$10$BsCXSiueL3CBorBv79mFuuxV0OxWcSIC.sZSYTxReuOqbeCMEzlC2', 1);
insert into authorities (username, authority) values ('Cate','ROLE_IT');
insert into authorities (username, authority) values ('Cate','ROLE_Security');

insert into users (username, password, enabled) values ('Den','{bcrypt}$2a$10$FyBkvAynQZsNFZSIP5ljh.MjUesl8pRpIUD/s2rcJ2ACCuCFHdTiW', 1);
insert into authorities (username, authority) values ('Den','ROLE_IT');
insert into authorities (username, authority) values ('Den','ROLE_Security');
insert into authorities (username, authority) values ('Den','ROLE_Director');