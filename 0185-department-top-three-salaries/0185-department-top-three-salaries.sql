Select d.name as Department, e.name as Employee, e.Salary 
from Employee e, Department d
where e.DepartmentId = d.Id
and 3> (select count(distinct Salary) 
          from Employee
          where Salary>e.Salary
          and DepartmentId = d.Id
          );