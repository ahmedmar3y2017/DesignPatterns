

explain select * from employees where first_name='Patricio';


-- by default Btree index
create index employees_id_index ON employees(first_name)


create index employees_id_index_hash   ON employees USING hash(first_name)


