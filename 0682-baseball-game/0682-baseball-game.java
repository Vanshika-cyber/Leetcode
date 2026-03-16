class Solution {
    public int calPoints(String[] operations) {

        int[] arr = new int[operations.length];
        int index = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                index--;
            }

            else if (operations[i].equals("D")) {
                arr[index] = arr[index - 1] * 2;
                index++;
            }

            else if (operations[i].equals("+")) {
                arr[index] = arr[index - 1] + arr[index - 2];
                index++;
            }

            else {
                arr[index] = Integer.parseInt(operations[i]);
                index++;
            }
        }

        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += arr[i];
        }

        return sum;
        
    }

}