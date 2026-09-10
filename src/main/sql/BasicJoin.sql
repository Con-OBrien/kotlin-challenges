-- Population Census
-- SELECT SUM(CITY.Population)
-- FROM COUNTRY
--          INNER JOIN CITY ON CITY.COUNTRYCODE = COUNTRY.CODE
-- WHERE COUNTRY.CONTINENT = 'Asia';

-- African Cities
-- SELECT City.Name
-- FROM COUNTRY
--          INNER JOIN CITY ON CITY.CountryCode = Country.Code
-- where Continent = 'Africa'

-- Average Population of Each Continent
-- SELECT Country.Continent, FLOOR(AVG(City.Population))
-- FROM Country
--          INNER JOIN City ON City.CountryCode = Country.Code
-- GROUP BY Country.Continent;

-- The Report
-- SELECT CASE
--            WHEN Grades.grade < 8 THEN NULL
--            ELSE Students.name
--            END, Grades.grade, Students.marks
-- FROM Grades
--          JOIN Students ON Students.marks >= Grades.Min_Mark AND Students.marks <= Grades.Max_Mark
-- ORDER BY Grades.Grade desc, Students.name;

