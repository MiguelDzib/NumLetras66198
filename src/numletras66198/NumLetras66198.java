
package numletras66198;
import java.util.Scanner;
public class NumLetras66198 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int multiplo;
        int unidad;
        
        System.out.println("Introduce un número del 0 al 99: ");
        int numero = entrada.nextInt();
    
        multiplo=numero/10 ;
        unidad=numero%10 ;
        
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] distinto = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"};
    
        switch (multiplo){
            case 0:
                System.out.println(unidades[unidad]);
                 break;
            case 1:
                System.out.println(distinto[unidad]);
                break; 
            case 2:
                if( unidad==0){
                System.out.println("veinte");
            } else {
                System.out.println ("veinti"+unidades[unidad]); 
            }
                break;
            case 3: 
                if( unidad==0){
                 System.out.println("treinta");
            } else {
                 System.out.println ("treinta y "+unidades[unidad]);
            }
                 break;
            case 4: 
                if( unidad==0){
                System.out.println("cuarenta");
            } else {
                System.out.println ("cuarenta y "+unidades[unidad]);
            }
                break;
            case 5: 
                 if( unidad==0){
                 System.out.println("cincuenta");
            } else {
            System.out.println ("cincuenta y "+unidades[unidad]);
            }
            break;
        case 6: 
            if( unidad==0){
                System.out.println("sesenta");
            } else {
                System.out.println ("sesenta y "+unidades[unidad]);
            }
                break;
        case 7: 
            if( unidad==0){
                System.out.println("setenta");
            } else {
            System.out.println ("setenta y "+unidades[unidad]);
            }
            break;
        case 8: 
            if( unidad==0){
                System.out.println("ochenta");
            } else {
            System.out.println ("ochenta y "+unidades[unidad]);
            }
            break;
        case 9: 
            if( unidad==0){
                System.out.println("noventa");
            } else {
            System.out.println ("noventa y "+unidades[unidad]);
            }
             break ;
            
        default:
            System.out.println ("numero no disponible");
            break;
        }
    }    
}    
    
