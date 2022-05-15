--Activity4a- we will be modifying the salesman table., Add a new column - grade - to the salesman table. The grade will be integer values.

ALTER table salesman
ADD grade int;

--Activity 4b- Set the value in the grade column for everyone to 100.

Update salesman set grade=100;

--Activity 4c- Use SELECT command to display the results.
select * FROM salesman;

--Activity5- we will be updating the data in the salesman table
---5a -> Update the grade score of salesmen from Rome to 200
select * from salesman where Salesman_city='Rome';
update salesman set grade=200 where salesman_city='Rome';

--5b ->Update the grade score of James Hoog to 300.

--5c ->Update the name McLyon to Pierre.
update salesman set salesman_name='Pierre' where salesman_name='McLyon';