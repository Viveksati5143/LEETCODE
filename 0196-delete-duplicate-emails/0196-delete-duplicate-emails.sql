delete p2 from person  p1 , person p2 
where p1.email = p2.email 
and
p2.id>p1.id;