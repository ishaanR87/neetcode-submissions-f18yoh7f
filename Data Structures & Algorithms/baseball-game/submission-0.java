class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<Integer>();

        for (String op: operations) {
            switch (op) {
                case "+":
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    int newSum = last + secondLast;
                    stack.add(last);
                    stack.add(newSum);
                    break;
                case "D":
                    stack.add(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.add(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int score : stack) {
            sum += score;
        }
        
        return sum;
    }
}