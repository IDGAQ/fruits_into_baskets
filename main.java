class Solution {
    public int totalFruit(int[] tree) {
        //一个连续的子数组
        //子数组中只有两个元素
        //子数组的len最长
        int len = 0;
        int left = 0;
        Set<Integer> set = new HashSet<>();
        for(int right=0;right<tree.length;right++ ){
            set.add(tree[right]);
            if (set.size()<=2){
            }else {
                left = right-1;
                while(tree[left]==tree[right-1]){
                    left--;
                }
                left++;
                //System.out.println(left+":"+right);
                set.clear();
                set.add(tree[right-1]);
                set.add(tree[right]);          
            }
            len = Math.max(len,right-left+1);
        }
        return len;
    }
}
