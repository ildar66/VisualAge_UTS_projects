---------------------------------------------------           
connect to plant user admin using 1010;     
---------------------------------------------------
--drop trigger ildar.DeleteLineBol; 

create trigger ildar.DeleteLineBol
after Delete on ildar.BOL
referencing old as oldval
for each row mode db2sql
Delete from ildar.bolWare where bolid = oldval.id;
---------------------------------------------------
--drop trigger   ildar.bolWare;

create trigger ildar.bolWare 
no cascade before insert on ildar.bolWare
referencing new as newval
for each row mode db2sql
when (newval.bolid not in ( select id from ildar.bol ))
signal sqlstate '75000' ('Unknown Bill!');
---------------------------------------------------

