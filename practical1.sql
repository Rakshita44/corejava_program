 CREATE DATABASE company;
ERROR 1007 (HY000): Can't create database 'company'; database exists
mysql> USE company;
Database changed
mysql> CREATE TABLE emp (id int primary key,name varchar(50),mobileno varchar(15),address varchar(100),salary decimal(10
, 2));
ERROR 1050 (42S01): Table 'emp' already exists
mysql>
mysql> insert into emp (id, name, mobileno, address, salary)
    -> values
    -> (1, 'rakshita', '1234567890', 'pune', 50000.00),
    -> (2, 'ram', '9876543210', 'solapur', 60000.00),
    -> (3, 'dipa', '5551234567', 'mumbai', 55000.00),
    -> (4, 'gouri', '5559876543', 'nashik', 70000.00),
    -> (5, 'kashi', '5551112233', 'miraj', 45000.00);
Query OK, 5 rows affected (0.04 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM emp;
+----+----------+------------+---------+----------+
| id | name     | mobileno   | address | salary   |
+----+----------+------------+---------+----------+
|  1 | rakshita | 1234567890 | pune    | 50000.00 |
|  2 | ram      | 9876543210 | solapur | 60000.00 |
|  3 | dipa     | 5551234567 | mumbai  | 55000.00 |
|  4 | gouri    | 5559876543 | nashik  | 70000.00 |
|  5 | kashi    | 5551112233 | miraj   | 45000.00 |
+----+----------+------------+---------+----------+
5 rows in set (0.00 sec)

mysql> SELECT * FROM emp WHERE name LIKE 'r%';
+----+----------+------------+---------+----------+
| id | name     | mobileno   | address | salary   |
+----+----------+------------+---------+----------+
|  1 | rakshita | 1234567890 | pune    | 50000.00 |
|  2 | ram      | 9876543210 | solapur | 60000.00 |
+----+----------+------------+---------+----------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM emp WHERE address LIKE '%u%';
+----+----------+------------+---------+----------+
| id | name     | mobileno   | address | salary   |
+----+----------+------------+---------+----------+
|  1 | rakshita | 1234567890 | pune    | 50000.00 |
|  2 | ram      | 9876543210 | solapur | 60000.00 |
|  3 | dipa     | 5551234567 | mumbai  | 55000.00 |
+----+----------+------------+---------+----------+
3 rows in set (0.00 sec)

mysql> SELECT * FROM emp WHERE mobileno LIKE '555________';
Empty set (0.00 sec)

mysql> SELECT * FROM emp WHERE mobileno LIKE '555_______';
+----+-------+------------+---------+----------+
| id | name  | mobileno   | address | salary   |
+----+-------+------------+---------+----------+
|  3 | dipa  | 5551234567 | mumbai  | 55000.00 |
|  4 | gouri | 5559876543 | nashik  | 70000.00 |
|  5 | kashi | 5551112233 | miraj   | 45000.00 |
+----+-------+------------+---------+----------+
3 rows in set (0.00 sec)

mysql> UPDATE emp
    -> SET salary = 75000.00
    -> WHERE id = 4;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> DELETE FROM emp
    -> WHERE id = 5;
Query OK, 1 row affected (0.04 sec)

mysql>