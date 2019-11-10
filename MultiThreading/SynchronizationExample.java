/**
  * Java class to demonstrate use of synchronization method and block in Java
  */
 class SycnronizationExample{
  
  
    public synchronized void lockedByThis(){
        System.out.println(" This synchronized method is locked by current instance of object i.e. this");
    }
  
    public static synchronized void lockedByClassLock(){
        System.out.println("This static synchronized method is locked by class level lock of this class i.e. SychronizationExample.class");

    }
  
    public void lockedBySynchronizedBlock(){
        System.err.println("This line is executed without locking");
      
        Object obj = String.class; //class level lock of Stirng class
      
        synchronized(obj){
            System.out.println("synchronized block, locked by lock represented using obj variable");
        }
    }
      
}