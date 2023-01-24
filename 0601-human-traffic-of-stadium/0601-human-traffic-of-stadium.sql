with new_group as(
    select id,visit_date,people,id - row_number() over(order by id) as new
    from Stadium
    where people >= 100
    )
    select id,visit_date,people 
    from new_group
    where new in(
        select new
        from new_group
        group by new
        having count(id) >= 3
        );