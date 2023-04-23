Select round(count(distinct player_id)/(
    Select count(distinct player_id) from activity), 2) as fraction
from Activity
where (player_id, event_date) in (
    Select player_id, Date(min(event_date) + 1)
    from Activity
    group by player_id);