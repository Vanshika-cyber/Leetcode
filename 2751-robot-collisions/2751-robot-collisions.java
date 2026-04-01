class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] index = new Integer[n];
        for(int i=0;i<n;i++){
            index[i]=i;
        }
        Arrays.sort(index,(a,b)->positions[a]-positions[b]);

        Stack<Integer> stack = new Stack<>();

        for(int id : index){

            if(directions.charAt(id)=='R'){
                stack.push(id);
            }
            else{

                while(!stack.isEmpty() && healths[id] > 0){

                    int top = stack.peek();

                    if(healths[top] < healths[id]){
                        stack.pop();
                        healths[id]--;
                        healths[top]=0;
                    }
                    else if(healths[top] > healths[id]){
                        healths[top]--;
                        healths[id]=0;
                    }
                    else{
                        stack.pop();
                        healths[top]=0;
                        healths[id]=0;
                    }
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(healths[i] > 0){
                ans.add(healths[i]);
            }
        }

        return ans;
    }
}