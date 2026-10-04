/*
Enter your query here.
*/
/*
 hacker id & name of hacker who achieved full scores for more than 1 challenge
 order desc number of challenges where hacker earned full score
 if > 1 hacker received full scores in same amount, sort by ascending

 90411 is the example to earn full score, 100 for challenge 66730 w/ difficulty 6
 90411 got 30 for 71055 w/ diff 2
 86870 got 30 for 71055

 ok so for each submission we've got the hacker who tried a challenge
 27205 tried challenge 4810 and got 4
 challenge_id 4810 has a difficulty of 4
 difficulty 4 has a score of 60

 get the hacker id and name
 of the hacker who
 completed a submission so has an entry in submissions equal to their hacker_id
 where their score for their challenge id
matches the score for that challenge difficulty level score (more than once)
order by that count of how many times they did it, otherwise hacker_id

SELECT hackers.hacker_id, hackers.name
FROM hackers
JOIN submissions ON submissions.hacker_id = hackers.hacker_id
JOIN challenges ON submissions.challenge_id = challenges.challenge_id
JOIN difficulty ON challenges.difficulty_level = difficulty.difficulty_level
WHERE submissions.score = difficulty.score
GROUP BY hackers.hacker_id, hackers.name
HAVING count(DISTINCT submissions.challenge_id) > 1
ORDER BY count(DISTINCT submissions.challenge_id) > 1 DESC, hacker_id

*/
SELECT hackers.hacker_id, hackers.name
FROM hackers
         JOIN submissions ON submissions.hacker_id = hackers.hacker_id
         JOIN challenges ON submissions.challenge_id = challenges.challenge_id
         JOIN difficulty ON challenges.difficulty_level = difficulty.difficulty_level
WHERE submissions.score = difficulty.score
GROUP BY hackers.hacker_id, hackers.name
HAVING count(DISTINCT submissions.challenge_id) > 1
ORDER BY count(DISTINCT submissions.challenge_id) DESC, hacker_id