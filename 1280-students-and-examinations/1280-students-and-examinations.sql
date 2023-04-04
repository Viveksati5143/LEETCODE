Select a.student_id, a.student_name, b.subject_name, count(e.subject_name) as attended_exams
from Students a
join Subjects b
left join Examinations e
on e.student_id = a.student_id
and e.subject_name = b.subject_name
group by a.student_id, b.subject_name
order by a.student_id;