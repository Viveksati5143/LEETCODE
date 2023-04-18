Select 'Low Salary' as Category, count(account_id) as accounts_count from accounts where income<20000
union
Select 'Average Salary' as Category, count(account_id) as accounts_count from accounts where income between 20000 and 50000
union
Select 'High Salary' as Category, count(account_id) as accounts_count from accounts where income>50000
order by accounts_count;