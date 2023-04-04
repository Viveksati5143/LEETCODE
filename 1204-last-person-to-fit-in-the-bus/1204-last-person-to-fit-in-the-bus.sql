select q1.person_name from Queue as q1
inner join Queue as q2
on q1.turn >= q2.turn
group by q1.turn
having sum(q2.weight)<=1000
order by sum(q2.weight) desc
limit 1;