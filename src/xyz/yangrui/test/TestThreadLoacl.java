package xyz.yangrui.test;

public class TestThreadLoacl {

    static volatile boolean flag = true;

    static ThreadLocal<String> tl = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t2 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t3 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t4 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t5 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t6 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t7 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t8 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t9 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t10 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t11 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t12 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t13 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t14 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t15 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t16 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };static ThreadLocal<String> t17 = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return Thread.currentThread().getName();
        }
    };

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            Thread.currentThread().setName("A线程");
            int anum = 0;
            while(flag){
                anum++;
                tl.set(tl.get() + (anum));
                t2.set(t2.get() + (anum));
                t3.set(t3.get() + (anum));
                t4.set(t4.get() + (anum));
                t5.set(t5.get() + (anum));
                t6.set(t6.get() + (anum));
                t7.set(t7.get() + (anum));
                t8.set(t8.get() + (anum));
                t9.set(t9.get() + (anum));
                t10.set(t10.get() + (anum));
                t11.set(t11.get() + (anum));
                t12.set(t12.get() + (anum));
                t13.set(t13.get() + (anum));
                t14.set(t14.get() + (anum));
                t15.set(t15.get() + (anum));
                t16.set(t16.get() + (anum));
                t17.set(t17.get() + (anum));
            }
            System.out.println("A线程 "+ anum);
            System.out.println(tl.get());
            System.out.println(t2.get());
            System.out.println(t3.get());
            System.out.println(t4.get());
            System.out.println(t5.get());
            System.out.println(t6.get());
            System.out.println(t7.get());
            System.out.println(t8.get());
            System.out.println(t9.get());
            System.out.println(t10.get());
            System.out.println(t11.get());
            System.out.println(t12.get());
            System.out.println(t13.get());
            System.out.println(t14.get());
            System.out.println(t15.get());
            System.out.println(t16.get());
            System.out.println(t17.get());
        }).start();

        new Thread(() -> {
            Thread.currentThread().setName("B线程");
            int bnum = 0;
            while(flag){
                bnum++;
                tl.set(tl.get() + (bnum));
                t2.set(t2.get() + (bnum));
                t3.set(t3.get() + (bnum));
                t4.set(t4.get() + (bnum));
                t5.set(t5.get() + (bnum));
                t6.set(t6.get() + (bnum));
                t7.set(t7.get() + (bnum));
                t8.set(t8.get() + (bnum));
                t9.set(t9.get() + (bnum));
                t10.set(t10.get() + (bnum));
                t11.set(t11.get() + (bnum));
                t12.set(t12.get() + (bnum));
                t13.set(t13.get() + (bnum));
                t14.set(t14.get() + (bnum));
                t15.set(t15.get() + (bnum));
                t16.set(t16.get() + (bnum));
                t17.set(t17.get() + (bnum));
            }
            System.out.println("B线程 "+bnum);
            System.out.println(tl.get());
            System.out.println(t2.get());
            System.out.println(t3.get());
            System.out.println(t4.get());
            System.out.println(t5.get());
            System.out.println(t6.get());
            System.out.println(t7.get());
            System.out.println(t8.get());
            System.out.println(t9.get());
            System.out.println(t10.get());
            System.out.println(t11.get());
            System.out.println(t12.get());
            System.out.println(t13.get());
            System.out.println(t14.get());
            System.out.println(t15.get());
            System.out.println(t16.get());
            System.out.println(t17.get());
        }).start();


        Thread.sleep(2000);
        flag = false;
    }




}
