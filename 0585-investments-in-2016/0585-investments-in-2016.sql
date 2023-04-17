Select round(sum(tiv_2016), 2) aS tiv_2016 from insurance 
where pid in 
(Select pid from insurance group by lat, lon having count(*) = 1) 
and pid not in
(Select pid from insurance group by tiv_2015 having count(*) = 1)