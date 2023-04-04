Select if (id%2 = 0, 
           id-1, 
           if(id!=(Select max(id) from seat),id+1,id)) as id, 
           student from Seat
order by id;