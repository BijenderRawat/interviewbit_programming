import java.util.Stack;

class MinStack {
    Stack<Integer> s = new Stack<>();
    int min;

    public void push(int x) {
        if (s.empty()) {
            min = x;
            s.push(x);
        } else if (x < min) {
            s.push(2 * x - min);
            min = x;
        } else
            s.push(x);
    }

    public void pop() {
        if (s.empty())
            return;
        int i = s.pop();
        if (i < min)
            min = 2 * min - i;
    }

    public int top() {
        if (s.empty())
            return -1;
        int i = s.peek();
        if (i < min)
            return min;
        return i;
    }

    public int getMin() {
        if (s.empty())
            return -1;
        return min;
    }
}

/*

The below code is using N extra space to solve the problem

class MinStack {
    Stack<Integer> mainstack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void push(int x) {
        mainstack.push(x);
        if (min.empty())
            minstack.push(x);
        else
            mainstack.push(Math.min(mainstack.peek(), x));
    }

    public void pop() {
        if (!mainstack.empty())
            mainstack.pop();
        if (!minstack.empty())
            minstack.pop();
    }

    public int top() {
        if (mainstack.empty())
            return -1;
        return mainstack.peek();
    }

    public int getMin() {
        if (mainstack.empty())
            return -1;
        return minstack.peek();
    }
}
*/