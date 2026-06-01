import java.util.ArrayList;
import java.util.List;
import models.Animal;
import models.Produtos;

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
    }    
}
