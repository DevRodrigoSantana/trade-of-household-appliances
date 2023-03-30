
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utilizar {    
    static NumberFormat formatandoValor = new DecimalFormat(" R$ #,##0.00");
    public static String doubletoString(Double valor){
        return formatandoValor.format(valor);
    }
    static NumberFormat valoPeso = new DecimalFormat(" #,##0.00"); 
    public static  String pesopesinho(Double valor){
        return valoPeso.format(valor);

    }
    
}

