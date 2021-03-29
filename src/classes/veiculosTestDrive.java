package classes;
public class veiculosTestDrive {
    public static void main(String[] args) {
        veiculos carro1 = new veiculos();
        veiculos carro2 = new veiculos();

    carro1.setCor ("Branco");
    carro1.setMarca ("Volks");
    carro1.setModelo ("VK");
    carro1.setNpass (5);
    carro1.setQtlitros(0);
    
    carro2.setCor ("Azul");
    carro2.setMarca ("GM");
    carro2.setModelo ("Spin");
    carro2.setNpass (7);
    carro2.setQtlitros(0);
    
    carro1.abastecer(30);
    carro2.abastecer(40);
    }
   
}
