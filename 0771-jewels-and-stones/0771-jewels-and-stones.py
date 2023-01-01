class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        return sum(map(jewels.count,stones))        