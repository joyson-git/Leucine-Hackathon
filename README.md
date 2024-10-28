"# Leucine-Hackathon"  - databases 
mysql> use user_access;
Database changed
mysql> show tables;
+-----------------------+
| Tables_in_user_access |
+-----------------------+
| requests              |
| software              |
| users                 |
+-----------------------+
3 rows in set (0.07 sec)

mysql> desc requests;
+-------------+---------------------------------------+------+-----+---------+----------------+
| Field       | Type                                  | Null | Key | Default | Extra          |
+-------------+---------------------------------------+------+-----+---------+----------------+
| id          | int                                   | NO   | PRI | NULL    | auto_increment |
| user_id     | int                                   | YES  | MUL | NULL    |                |
| software_id | int                                   | YES  | MUL | NULL    |                |
| access_type | enum('Read','Write','Admin')          | YES  |     | NULL    |                |
| reason      | text                                  | YES  |     | NULL    |                |
| status      | enum('Pending','Approved','Rejected') | YES  |     | Pending |                |
+-------------+---------------------------------------+------+-----+---------+----------------+
6 rows in set (0.02 sec)

mysql> desc users;
+----------+------------------------------------+------+-----+----------+----------------+
| Field    | Type                               | Null | Key | Default  | Extra          |
+----------+------------------------------------+------+-----+----------+----------------+
| id       | int                                | NO   | PRI | NULL     | auto_increment |
| username | varchar(50)                        | NO   | UNI | NULL     |                |
| password | varchar(255)                       | NO   |     | NULL     |                |
| role     | enum('Employee','Manager','Admin') | YES  |     | Employee |                |
+----------+------------------------------------+------+-----+----------+----------------+
4 rows in set (0.01 sec)

mysql> desc software;
+---------------+------------------------------+------+-----+---------+----------------+
| Field         | Type                         | Null | Key | Default | Extra          |
+---------------+------------------------------+------+-----+---------+----------------+
| id            | int                          | NO   | PRI | NULL    | auto_increment |
| name          | varchar(100)                 | NO   |     | NULL    |                |
| description   | text                         | YES  |     | NULL    |                |
| access_levels | enum('Read','Write','Admin') | YES  |     | NULL    |                |
+---------------+------------------------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)

mysql>














