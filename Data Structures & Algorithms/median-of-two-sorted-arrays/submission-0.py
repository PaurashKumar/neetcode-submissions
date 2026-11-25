class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:

        nm=sorted(nums1+nums2)
        print(nm)

        n=len(nm)
        if n%2==0:
            nn=int(n/2)
            return float(nm[nn]+nm[nn-1])/2
        else:
            return float(nm[int(n/2)])
        