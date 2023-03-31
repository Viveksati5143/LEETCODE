Select unique_id, name 
from Employees as a 
left join EmployeeUNI as b 
on a.id = b.id;