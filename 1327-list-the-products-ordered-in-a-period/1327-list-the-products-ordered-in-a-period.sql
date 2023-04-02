Select product_name, sum(unit) as unit from Products p 
join Orders o
on p.product_id = o.product_id
where left(order_date,7) = "2020-02"
group by product_name
having sum(unit)>=100;