Select P.firstName, P.lastName, A.city, A.state From person P, address A
where P.personId=A.personId
Union
Select P.firstName, P.lastName, null, null From person P
where p.personId not in (Select personId from address)