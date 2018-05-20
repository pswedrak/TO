public class Main {

    public static void main(String[] args){

        Automat automat = new Automat(100);
        System.out.println("Automat z kawą");

        automat.makeCoffee();
        automat.insertCoin();
        automat.makeCoffee();
        automat.insertCoin();
        automat.insertCoin();
        automat.makeCoffee();
        automat.takeCoffee();
        automat.makeCoffee();

    }

}
