-- All using MySQL variant

-- Revising the Select Query I
-- SELECT *
-- FROM CITY
-- WHERE POPULATION > 100000 AND COUNTRYCODE = 'USA';

-- Revising the Select Query II
-- SELECT NAME
-- FROM CITY
-- WHERE POPULATION > 120000 AND COUNTRYCODE = 'USA';

-- Select All
-- SELECT * FROM CITY;

-- Select By ID
-- SELECT * FROM CITY WHERE ID = 1661;

-- Japanese Cities Attributes
-- SELECT * FROM CITY WHERE COUNTRYCODE = 'JPN';

-- Japanese Cities Names
-- SELECT NAME FROM CITY WHERE COUNTRYCODE = 'JPN';

-- Weather Observation Station 1
-- SELECT CITY, STATE
-- FROM STATION;

-- Weather Observation Station 3
-- SELECT DISTINCT CITY FROM STATION WHERE (ID % 2) = 0 ;

-- Weather Observation Station 4
-- SELECT COUNT(CITY) - COUNT(DISTINCT CITY) FROM STATION;

-- Weather Observation Station 5
-- SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY), CITY LIMIT 1;
-- SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY) DESC, CITY LIMIT 1;

-- Weather Observation Station 6
-- SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE 'a%'
--                                      OR CITY LIKE 'e%'
--                                      OR CITY LIKE 'i%'
--                                      OR CITY LIKE 'o%'
--                                      OR CITY LIKE 'u%'

-- Weather Observation Station 7
-- SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '%a'
--                                      OR CITY LIKE '%e'
--                                      OR CITY LIKE '%i'
--                                      OR CITY LIKE '%o'
--                                      OR CITY LIKE '%u'

-- Weather Observation Station 8
-- SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '^[aeiou].*[aeiou]$';

-- Weather Observation Station 9
-- SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '^[aeiou]';

-- Weather Observation Station 10
-- SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '.*[aeiou]$';

-- Weather Observation Station 11
-- SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '^[aeiou].*[aeiou]$';

-- Weather Observation Station 12
-- SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '^[^aeiou].*[^aeiou]$';

-- Higher Than 75 Marks
-- SELECT NAME FROM STUDENTS WHERE MARKS > 75 ORDER BY substring(NAME, -3), ID;

-- Employee Salaries
-- SELECT NAME FROM EMPLOYEE where salary > 2000 AND months < 10 order by employee_id;

