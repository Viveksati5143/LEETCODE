Select employee_id 
from Employees
where salary < 30000
and manager_id <> 'null'
and manager_id not in (Select employee_id from Employees)
order by employee_id;