class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char arr1[]=s1.toCharArray();
        Arrays.sort(arr1);

        String str1=new String(arr1);

        for(int i=0;i<s2.length();i++){
            for(int j=i;j<s2.length();j++){
                char [] arr2=s2.substring(i,j+1).toCharArray();
                Arrays.sort(arr2);
                String sortedstr2=new String(arr2);
                if(sortedstr2.equals(str1)){
                    return true;
                }
            }
        }
        return false;
    }
}
