

create sequence seq_no start with 1 increment by 1 nocycle;

INSERT INTO EMPLOYEE(NO, NAME, JOBGRADE, DEPARTMENT, EMAIL)
VALUES(SEQ_NO.NEXTVAL,'고길동','차장',20,'a@naver.com');

select*from employee;