import java.util.ArrayList;
import java.util.List;
import models.Animal;
import models.Produtos;
import models.Forma;

public class principal {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(List.of("a","b","c"));
        lista.forEach(System.out::println);
        Animal animal = new Cachorro();
        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }else
            System.out.println("Not a dog");

        ArrayList<Produtos> carrinho = new ArrayList<>();
        carrinho.add(new Produtos("Leite", 5.00));
        carrinho.add(new Produtos("Doce", 3.00));
        carrinho.add(new Produtos("bala", 1.00));
        //feito dessa forma por escolhe, estou me acostumando a usar streams
        System.out.println("média: " +carrinho.stream()
                                .mapToDouble(Produtos::getPreco)
                                .sum()/carrinho.size());

        var cir = new Circulo();
        var quad = new Quadrado();
        quad.calcularArea(3.4);
        cir.calcularArea(7);
        ArrayList<Forma> lousa = new ArrayList<>(List.of(quad, cir));
        lousa.forEach(System.out::println);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        ContaBancaria conta3 = new ContaBancaria();

        conta1.adicionar(10);
        conta2.adicionar(10);
        conta3.adicionar(200);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        System.out.println(contas.stream()
                .mapToDouble(ContaBancaria::getSaldo)
                .max());
    }    
}
