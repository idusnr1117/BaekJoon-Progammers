SELECT 
    CASE
        WHEN (D.SKILL_CODE & P.CODE) != 0
             AND EXISTS (
                 SELECT 1
                   FROM SKILLCODES F
                  WHERE F.CATEGORY = 'Front End'
                    AND (D.SKILL_CODE & F.CODE) != 0
             )
        THEN 'A'
        WHEN (D.SKILL_CODE & CSH.CODE) != 0
        THEN 'B'
        WHEN EXISTS (
                 SELECT 1
                   FROM SKILLCODES F
                  WHERE F.CATEGORY = 'Front End'
                    AND (D.SKILL_CODE & F.CODE) != 0
             )
        THEN 'C'
    END AS GRADE,
    D.ID,
    D.EMAIL
  FROM DEVELOPERS D
  JOIN SKILLCODES P   ON P.NAME = 'Python'
 JOIN SKILLCODES CSH ON CSH.NAME = 'C#'
 WHERE (D.SKILL_CODE & P.CODE) != 0
   AND EXISTS (SELECT 1
                 FROM SKILLCODES F
                WHERE F.CATEGORY = 'Front End'
                  AND (D.SKILL_CODE & F.CODE) !=        0)
    OR (D.SKILL_CODE & CSH.CODE) != 0
    OR EXISTS (SELECT 1 FROM SKILLCODES F WHERE F.CATEGORY = 'Front End' AND (D.SKILL_CODE & F.CODE) != 0)
 ORDER BY GRADE, D.ID;
