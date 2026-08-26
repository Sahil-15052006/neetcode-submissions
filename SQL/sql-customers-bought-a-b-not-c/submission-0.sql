-- Write your query below

select *
from customers
where customer_id in (
select customer_id
from orders
group by customer_id
having count(distinct case
    when product_name in ('A','B')
    then product_name
end )=2
and count(case
    when product_name = 'C'
    then 1
end ) = 0
)
order by customer_name;