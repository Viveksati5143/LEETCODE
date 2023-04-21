Select a.employee_id, a.name, count(b.reports_to) as reports_count, round(avg(b.age)) as average_age
from Employees a, Employees b
where a.employee_id = b.reports_to
group by employee_id
order by employee_id;