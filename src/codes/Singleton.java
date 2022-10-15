package codes;

class SingletonClass{
    private static  SingletonClass st = new SingletonClass();
    private SingletonClass(){ }
    public static SingletonClass getObject(){
        return st;
    }


}

public class Singleton {

    public static void main(String[] args)
    {
        SingletonClass stObj ;
        stObj = SingletonClass.getObject();
        if(stObj == null)
            System.out.println("Object creation failed");
        else
            System.out.println("Object creation succeed ");

    }
}
