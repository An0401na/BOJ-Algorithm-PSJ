-- 코드를 입력하세요

# SELECT *
SELECT FIRST_HALF.FLAVOR AS FLAVOR
FROM FIRST_HALF, ICECREAM_INFO 
WHERE (FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR) && TOTAL_ORDER > 3000 && INGREDIENT_TYPE ='fruit_based';

# SELECT * FROM FIRST_HALF;
# SELECT * FROM ICECREAM_INFO;