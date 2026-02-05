package monsters;

public class Main {

    public static void main(String[] args){
        Monster p1 = new Water("Polly", Eyes.TWO);
        Monster p2 = new Fire("Charzar", Eyes.ONE);

        System.out.println("Pokeman 1 " + p1.getName());
        System.out.println("Pokeman 2 " + p2.getName());

        System.out.println("Pokeman 1 " + p1.getEyes());
        System.out.println("Pokeman 2 " + p2.getEyes());

        p1.specialPowers();
        p2.specialPowers();
    }

}
