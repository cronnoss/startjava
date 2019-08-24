\c jaeger

--print the whole table
SELECT * FROM robots; 

--display only not destroyed robots
SELECT * FROM robots 
    WHERE status != 'Destroyed';

--display robots of several series, for example Mark-1 and Mark-6
SELECT * FROM robots
    WHERE mark = 'Mark-1' OR
        mark = 'Mark-6';

--sort table descending by column mark
SELECT * FROM robots 
    ORDER BY LENGTH(mark), mark DESC;

--display the oldest robot
SELECT * FROM robots
    ORDER BY launch
limit 1;

--display the robots that destroyed the most / least of all kaiju
SELECT * FROM robots
    ORDER BY kaijukill DESC
limit 1;

SELECT * FROM robots
    ORDER BY kaijukill
limit 1;

--display the average weight of robots
SELECT avg(weight) as "average weight"
    FROM robots;

--increase the number of kaiju destroyed by robots that are still not destroyed
UPDATE robots
    SET kaijukill = kaijukill + 1
    WHERE status = 'Workable';

--remove destroyed robots
DELETE FROM robots 
    WHERE status = 'Destroyed';