class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<Integer>();

        for (String op: operations) {
            switch (op) {
                case "+":
                    int last = stack.pop();
                    int secondLast = stack.peek();
                    stack.push(last);
                    stack.push(last + secondLast);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.add(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int val: stack) {
            sum += val;
        }

        return sum;
    }
}