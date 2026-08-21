-- Write your query below
select first_name , last_name,
address.city, address.state
from person 
left join address
on person.person_id = address.person_id
;