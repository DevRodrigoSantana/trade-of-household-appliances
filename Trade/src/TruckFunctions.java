import javax.swing.*;
import java.util.*;

public class TruckFunctions {
    String truckOptionList = "O que deseja fazer? \n 0) Sair \n 1) Criar caminhão \n 2) Listar caminhões \n 3) Atualizar caminhão \n 4) Deletar caminhão";
    private static ArrayList<Truck> truckList = new ArrayList<Truck>();
    private static int truckListIterator = 0;

    public static void createTruck(){
        // Pegando os valores (Placa, peso_max e motorista)
        String placa = JOptionPane.showInputDialog(null, "Digite a placa do caminhão: ");
        String peso_max_string = JOptionPane.showInputDialog(null, "Digite o peso máximo do caminhão: ");
        int peso_max_int = Integer.parseInt(peso_max_string);
        String motorista = JOptionPane.showInputDialog(null, "Digite o nome do motorista do caminhão: ");
    
        // Adicionando no ArrayList um novo OBJ de Caminhão
        truckList.add(new Truck());  

        // Adicionando no OBJ os valores de seus atributos
        truckList.get(truckListIterator).setId(truckListIterator);
        truckList.get(truckListIterator).setPlaca(placa);
        truckList.get(truckListIterator).setPeso_maximo(peso_max_int);
        truckList.get(truckListIterator).setMotorista(motorista);

        truckListIterator++;
        // options();
    }

    static String displayTrucks;
    public static void listTruck(){
        displayTrucks = "";
        
        for(Truck tt : truckList){
            displayTrucks += tt.info();
        }

        JOptionPane.showMessageDialog(null, displayTrucks);
        
        // options();
    }
    public static void updateTruck(){

    }   
    public static void deleteTruck(){
        String idString = JOptionPane.showInputDialog(null, "Digite o id do caminhão: ");
        int idInt = Integer.parseInt(idString);
        
        for(Truck tt : truckList){
            if(tt.getId() == idInt){
                truckList.remove(tt);
                JOptionPane.showMessageDialog(null, "Caminhão removido com sucesso...");
                break;
            }
        }
        System.out.println(truckList.size());
        // options();
    }
}
