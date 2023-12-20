package ru.mirea.lab20;


import java.util.Stack;

public class CalcModel {
    private Stack<Number> numberStack;
    public CalcModel() {
        numberStack = new Stack<>();
    }
    public <T extends Number> void eventTick(T t) {
        numberStack.add(t);
    }
    public void eventTick(char c) {
        Number a;
        Number b;
        try {
            System.out.println(numberStack.get(1));
        }catch(Exception e){
            System.out.println(e);
        }

        switch (c) {
            case '*':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(miniCalc.multiply(b,a));
                break;
            case '/':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(miniCalc.divide(b,a));
                break;
            case '+':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(miniCalc.sum(b,a));
                break;
            case '-':
                a = numberStack.pop();
                b = numberStack.pop();
                numberStack.push(miniCalc.subtraction(b,a));
                break;
            default:
                throw new RuntimeException("Incorrect symbol detected");
        }
    }
    public void clearStack() {
        numberStack.clear();
    }

    @Override
    public String toString() {
        String result = "";
        int count = numberStack.size();
        for (Number number : numberStack) {
            result += number;
            if (count > 1) {
                result += " ";
            }
            count--;
        }
        return result;
    }
}
