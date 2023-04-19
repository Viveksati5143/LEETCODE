Select id, count(*) as num from(
    Select requester_id id from RequestAccepted
union all 
    Select accepter_id id from RequestAccepted) r
group by id
order by num desc limit 1;