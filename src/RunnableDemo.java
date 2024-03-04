public class RunnableDemo implements Runnable{

    public void run() {
        LazyInitializedSingleton lis = LazyInitializedSingleton.getInstance();
        System.out.printf("lis hashcode=%s%n",lis.hashCode());
    }
}
