package classes;

import javax.swing.JOptionPane;

public class veiculos {
    private String cor;
    private String marca;
    private String modelo;
    private int npass;
    private double qtlitros;
    
public veiculos(){
this.cor = "Azul";
this.marca = "Ford"; 
this.modelo = "KA";
this.npass = 5;
this.qtlitros = 50;
} 

public void setCor(String cor){
    this.cor = cor;
}
public void setMarca(String marca){
    this.marca = marca;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}
public void setNpass(int npass){
    this.npass = npass;
}
public void setQtlitros(double qtlitros){
    this.qtlitros = qtlitros;
}

public void abastecer(double qtlitros){
if (qtlitros>0){this.qtlitros=qtlitros;
                JOptionPane.showMessageDialog
                (null, "Litros abastecidos: "+this.qtlitros); 
}else {JOptionPane.showMessageDialog(null, "Insira um valor positivo.");
}
}   
}
