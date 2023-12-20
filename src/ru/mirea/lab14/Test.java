package ru.mirea.lab14;


public class Test {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new BoundedWaitList<Integer>(3);
        waitList.add(1);
        waitList.add(5);
        waitList.add(3);
        System.out.println(waitList);
        System.out.println(waitList.isEmpty());
        System.out.println(waitList.contains(3));
        System.out.println(waitList.toString());
        UnfairWaitList<Integer> unfairwaitList = new UnfairWaitList<Integer>();
        unfairwaitList.add(1);
        unfairwaitList.add(5);
        unfairwaitList.add(3);
        unfairwaitList.add(4);
        System.out.println(unfairwaitList);
        unfairwaitList.moveToBack(3);
        unfairwaitList.remove(1);
        unfairwaitList.isEmpty();
        System.out.println(unfairwaitList);
    }
}