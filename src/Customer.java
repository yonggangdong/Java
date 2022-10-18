public class Customer {
    String name;
    int age;
    boolean isMale;

    public void eat(){
        System.out.println("吃了吗");
    }

    public void sleep(int hour){
        System.out.println("休息呢"+hour+"个小时");
    }
    public String getName(){
        return name;
    }
}
