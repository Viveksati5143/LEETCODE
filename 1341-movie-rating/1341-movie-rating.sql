(Select name as results from MovieRating
 inner join Users on MovieRating.user_id = Users.user_id
 group by MovieRating.user_id
 order by count(*) desc, name
 limit 1
)

union

(Select title as results from MovieRating
 inner join Movies on MovieRating.movie_id = Movies.movie_id
 where SUBSTRING(created_at,6,8) = 02
 group by MovieRating.movie_id
 order by avg(rating) desc, title
 limit 1
)