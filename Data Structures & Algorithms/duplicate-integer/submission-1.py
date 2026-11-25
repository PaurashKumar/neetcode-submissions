class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        st=set()
        for x in nums:
            st.add(x)
        if len(st)!=len(nums):
            return True
        else:
            return False
         