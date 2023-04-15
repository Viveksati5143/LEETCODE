Select customer_id 
from Customer
group by customer_id
having count(distinct product_key) = (Select count(distinct product_key) from Product);