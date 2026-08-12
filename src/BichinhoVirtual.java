import static java.lang.IO.println;

public class BichinhoVirtual {

    //Atributos

    private String nome;
    private int fome;
    private int energia;
    private String humor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {

        if (fome == 100) {
            println("Estou faminto");
        } else if (fome <= 70 && fome >= 41) {
            println("Estou com fome");
        } else if (fome <= 40 && fome > 1) {
            println("Estou sem fome");
        } else {
            println("Saciado");
        }
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getEnergia() {
        if (energia == 100) {
            println("Totalmente pilhado");
        } else if (energia <= 70 && energia >= 41) {
            println("Com energia");
        } else if (energia <= 40 && energia > 1) {
            println("Cansado");
        } else {
            println("Esgotado");
        }
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getHumor() {

        if (energia == 100 && fome == 0) {
            println("Humor: Muito feliz !!");
        } else if (energia <= 70 && fome >= 41) {
            println("Humor: Feliz");
        } else if (energia <= 40 && fome > 1) {
            println("Humor: Insatisfeito");
        } else {
            println("Humor: Irritado");
        }

        return "Bichinho virtual Cadastrado";
    }
}
