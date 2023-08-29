SELECT * FROM mydb2.student;

create table dept
(deptno int primary key,
 dname varchar(50)
 );
 
create table emp 
( empid int primary key,
  empname varchar(50),
  deptno int references dept(deptno)
  );
  insert into dept values(10,'Account');
  insert into dept values(20,'Hr');
  insert into dept values(30,'Project');
  
  insert into emp values(1,'Ram',10);
  insert into emp values(2,'Shyam',20);
  insert into emp values(3,'Sita',null);
  commit;
  select * from emp;
  select * from dept;
  
  /*  inner join */
select emp.empid,emp.empname,dept.deptno,dept.dname
from emp,dept
where emp.deptno = dept.deptno;

/* left outer join */
select emp.empid,emp.empname,dept.deptno,dept.dname
from emp
left join dept
on emp.deptno = dept.deptno;

/*  right outer join */
select emp.empid,emp.empname,dept.deptno,dept.dname
from emp
right join dept
on emp.deptno = dept.deptno;


/* full outer join */
select emp.empid,emp.empname,dept.deptno,dept.dname
from emp
left join dept
on emp.deptno = dept.deptno
union
select emp.empid,emp.empname,dept.deptno,dept.dname
from emp
right join dept
on emp.deptno = dept.deptno;

