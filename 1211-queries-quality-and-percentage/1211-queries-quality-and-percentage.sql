Select query_name, 
round(sum(rating/position)/count(rating), 2) as quality, 
round(sum(rating<"3")*100/count(rating), 2) as poor_query_percentage 
from Queries
group by query_name;