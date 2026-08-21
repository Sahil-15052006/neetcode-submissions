-- Write your query below
select name 
from customers
where id in (
    select id from customers
    except
    select customer_id from orders
);