package Lesson028_2;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        Thread thread1 = new Thread(runner::firstThread);
        Thread thread2 = new Thread(runner::secondThread);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        runner.finish();
    }
}

class Runner {
    private final Account account1 = new Account();
    private final Account account2 = new Account();

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    private void takeLocks(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }

                if (firstLockTaken) {
                    lock1.unlock();
                }

                if (secondLockTaken) {
                    lock2.unlock();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void firstThread() {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            takeLocks(lock1, lock2);
            try {
                Account.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }

        }
    }

    public void secondThread() {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            takeLocks(lock2, lock1);

            try {
                Account.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock2.unlock();
                lock1.unlock();
            }
        }
    }

    public void finish() {
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
        System.out.println();
        System.out.println("Total account: " + (account1.getBalance() + account2.getBalance()));
    }
}

class Account {
    private int balance = 10000;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}
