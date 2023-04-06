Select request_at as Day, 
round(count(if(status <>'completed',True,Null))/Count(status), 2) as 'Cancellation Rate'
from Trips
where (request_at between '2013-10-01' and '2013-10-03')
and client_id not in (Select users_id from Users where banned='Yes')
and driver_id not in (Select users_id from Users where banned='Yes')
group by request_at;