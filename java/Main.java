public class Main {
    public void animalSound(){
        System.out.println("the generate pig sounds:");

    }
}
class pig extends Main {
    @override
    public void animalSound(){
        System.out.println("wee weee");
    }
class Main{
    public static void main(String[] args) {
        pig myPig = new pig();
        myPig.animalSound();
    }
}


    
}