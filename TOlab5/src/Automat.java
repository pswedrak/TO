public class Automat {

    private Boolean isCoffeeInside;
    private Boolean isCoinInside;
    private Integer limit;
    private Integer counter;

    public Automat(Integer limit){
        this.isCoffeeInside = false;
        this.isCoinInside = false;
        this.limit = limit;
        this.counter = 0;
    }

    public void makeCoffee(){

        if(this.isCoffeeInside.equals(true)){

            System.out.println("Najpierw odbierz poprzednią kawę");
        }
        else if(this.limit.equals(this.counter)){

            System.out.println("Zapas kawy został wyczerpany");
        }
        else if(this.isCoinInside.equals(false)){

            System.out.println("Wrzuć monetę!");
        }
        else{
            System.out.println("Poczekaj na zrobienie kawy");
            this.isCoffeeInside = true;
            this.isCoinInside = false;
            this.counter++;
        }

    }


    public void insertCoin(){

        if(this.isCoinInside.equals(true)){
            System.out.println("W automacie znajduje się już moneta");
        }
        else{
            System.out.println("Przyjęto monetę");
            this.isCoinInside = true;
        }
    }

    public void takeCoffee(){

        if(this.isCoinInside.equals(true)){
            System.out.println("Wydano kawę");
            this.isCoffeeInside = false;
        }
        else{
            System.out.println("Brak kawy do odebrania!");
        }
    }

    public void takeCoin(){

        if(this.isCoinInside.equals(true)){
            System.out.println("Zwrócono monetę");
            this.isCoinInside = false;
        }
        else{
            System.out.println("Brak monety do zwrotu");
        }

    }

    public void supplyCoffee(Integer limit){

        this.limit = limit;
        this.counter = 0;
        System.out.println("Załadowano kawę");
    }

    public Boolean getCoffeeInside() {
        return isCoffeeInside;
    }

    public void setCoffeeInside(Boolean coffeeInside) {
        isCoffeeInside = coffeeInside;
    }

    public Boolean getCoinInside() {
        return isCoinInside;
    }

    public void setCoinInside(Boolean coinInside) {
        isCoinInside = coinInside;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}
