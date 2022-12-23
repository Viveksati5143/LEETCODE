select name as Customers 
from customers 
where id not in
(
    select CustomerId from orders
);