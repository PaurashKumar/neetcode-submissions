class Solution:
    def rob(self, nums: List[int]) -> int:

        a=0
        b=0
        for i in nums:
            tmp=max(a+i,b)
            a=b
            b=tmp
        return tmp

    #  tmp=[0+1,0]=1
    # a=b a=0
    # b=tmp b=1

     # tmp [0+1,1]=1
      #a=1
      #b=1

      #tmp [1+3,1]=4
      #a=b a=1
      #b=4

      #tmp[1+3,4]=4
      #a=b=a=4
      #b=tmp b=4


      #ans===>4  