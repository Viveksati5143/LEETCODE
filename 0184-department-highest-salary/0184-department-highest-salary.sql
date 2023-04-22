Select b.name as Department, a.name as Employee, a.Salary 
from Employee a, Department b
where a.departmentId = b.id
and (departmentId, Salary) in(
    Select departmentId, max(Salary) as max from Employee
    group by departmentId);