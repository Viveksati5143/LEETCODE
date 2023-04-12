Select name 
from Employee
where id in
(Select managerId from Employee
group by managerId
having count(managerId)>=5);