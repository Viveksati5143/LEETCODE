#OR
# Select name, population, area from World where area >= 3000000 or population >= 25000000;

#UNION
Select name, population, area from World where area >= 3000000
UNION
Select name, population, area from World where population >= 25000000;