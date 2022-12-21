insert into user_details(id,birth_date,name)
values(10001, current_date(), 'Anvika');
insert into user_details(id,birth_date,name)
values(10002, current_date(), 'Shiwangi');
insert into user_details(id,birth_date,name)
values(10003, current_date(), 'Sanika');
insert into user_details(id,birth_date,name)
values(10004, current_date(), 'Upanya');

insert into post(id,description,user_id)
values(20001,'I want to learn AWS', 10001);

insert into post(id,description,user_id)
values(20002,'I want to learn DevOps', 10001);

insert into post(id,description,user_id)
values(20003,'Multicloud Setup', 10002);

insert into post(id,description,user_id)
values(20004,'kafka cluster', 10002);