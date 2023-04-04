Select name, bonus from Employee e
left join Bonus b
on e.empId = b.empId
having bonus < 1000 or bonus is null;