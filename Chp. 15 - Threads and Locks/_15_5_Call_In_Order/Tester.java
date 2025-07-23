<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _15_5_Call_In_Order;

public class Tester {
    public static void main(String[] args) {
        CallInOrder callInOrder = new CallInOrder();

        MyThread thread1 = new MyThread(callInOrder, "first");
        MyThread thread2 = new MyThread(callInOrder, "second");
        MyThread thread3 = new MyThread(callInOrder, "third");

        thread3.start();
        thread2.start();
        thread1.start();
    }
}
