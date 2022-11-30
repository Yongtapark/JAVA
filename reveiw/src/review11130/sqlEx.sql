create table department(
	deptno	number(3) 		not null,
	dname	varchar2(50) 	not null,
	college number(3) 		not null,
	loc		varchar2(10) 	not null,
	constraint department_pk primary key(deptno)
);

insert into department values(101,'tq',12,'tq');
insert into department values(203,'tq',12,'tq');

create table professor(
	profno 		number(5,0) 		not null,
	name	 	varchar2(10)		not null,
	ename	 	varchar2(20)		not null,
	position  	varchar2(20)		not null,
	sal 	 	number(4,0)			not null,
	hiredate	 date				not null,
	age		 	number(3,0)			not null,
	deptno 	 	number(3,0)			not null,
	constraint professor_pk primary key(profno)
);

alter table professor add foreign key (deptno) references department(deptno);

INSERT INTO PROFESSOR VALUES(9991,'홍길동','cappool','교수',500,TO_DATE('24-06-1982','DD-MM-YYYY'),20,101);

select * from professor;
select * from department;

drop table department;
drop table professor;
