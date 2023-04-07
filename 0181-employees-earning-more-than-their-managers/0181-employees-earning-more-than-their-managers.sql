Select e1.name as Employee 
from Employee as e1, Employee as e2 
where e1.managerId = e2.Id and e1.salary > e2.salary