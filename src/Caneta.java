public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void escrever() {
        if (tampada) {
            System.out.println("Erro.esta tampada.Destampe para rabiscar");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo() + ", ponta " + this.getPonta() +
                ", cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
    }
}
