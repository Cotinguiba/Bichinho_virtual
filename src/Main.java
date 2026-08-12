import static java.lang.IO.*;

void main() {

    BichinhoVirtual beto = new BichinhoVirtual();

    beto.setNome(readln("Informe o nome do Bichinho virtual: "));

    beto.setFome(Integer.parseInt(readln("Informe o nivel de fome entre 0 a 100: ")));

    beto.setEnergia(Integer.parseInt(readln("Informe o nivel de energia entre 0 a 100: ")));

    println("==============");
    IO.println("Nome: " + beto.getNome());
    IO.println("Nivel de Fome: " + beto.getFome());
    IO.println("Energia: " + beto.getEnergia() + "%");
    println(beto.getHumor());

}
