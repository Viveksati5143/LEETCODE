select Users.User_id as buyer_id, Users.join_date, count(Orders.order_id) as orders_in_2019 
from Users
left join Orders 
on Orders.buyer_id=Users.user_id and
year(order_date)='2019'
group by Users.user_id;