public class Aula02 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("BIC","Amarelo", 0.4f);
        c1.escrever();
        c1.tampar();
        c1.status();

        System.out.println(" ");

        Caneta c2 = new Caneta("Pentel", "Azul", 0.5f);
        c2.status();

        System.out.println(" ");

        Caneta c3 = new Caneta("Faber Castell","Vermelha", 0.2f);
        c3.status();

    }
}
