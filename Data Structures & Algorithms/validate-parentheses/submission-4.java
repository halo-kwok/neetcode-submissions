class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // closing bracket: stack must be non-empty and top must match
                if (stack.isEmpty() || !isPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // catches leftover unclosed brackets (i.e. if last char is open bracket)
    }

    public boolean isPair(Character a, Character b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
}