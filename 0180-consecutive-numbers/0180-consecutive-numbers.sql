Select distinct L1.num as ConsecutiveNums
from Logs L1,
     Logs L2,
     Logs L3
where
    L1.id = L2.id - 1
    And L2.id = L3.id - 1
    And L1.num = L2.num
    And L2.num = L3.num;