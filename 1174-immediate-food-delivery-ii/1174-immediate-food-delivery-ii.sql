Select ROUND(100*avg(order_date = customer_pref_delivery_date), 2) as immediate_percentage
from Delivery 
where (customer_id, order_date)
in (
    Select customer_id, min(order_date) as min_date
from Delivery
group by customer_id
);