Select if(count(num) = 1, num, null) as num 
from MyNumbers 
group by num 
order by count(*), num desc limit 1;