/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juanes
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Empleado> listaempleados = new ArrayList<Empleado>();
        System.out.println("---CALCULAR-PAGO-DE-EMPLEADOS---");
        Scanner input = new Scanner (System.in);
        System.out.println("Introduccion de empleados para salir pon * en el nombre del empleado");

        System.out.println("Ingresa los datos de tus empleados");

        boolean salir = false;
        while(salir == false){
            System.out.print("Ingresa el nombre del empleado: ");
            String n= input.next();
            
            if("*".equals(n)){
                salir = true;

            }else{
                System.out.print("Ingresa las horas normales trabajadas: ");
                int h = input.nextInt();
                System.out.print("Ingresa  las horas extras trabajadas: ");
                int hext = input.nextInt();

                Empleado emp = new Empleado(n, h, hext);
                //System.out.print("Empleado " + emp.nomEmp);
                

                listaempleados.add(emp);
                

                
            }
        }
        
        //System.out.print(listaempleados.get(0).nomEmp);
        
        Iterator<Empleado> iterator = listaempleados.iterator();  
        while (iterator.hasNext())  
        {  
            Empleado i = iterator.next();  
            System.out.println("Nombre: " + i.nomEmp);
            System.out.println("Pago total de horas normales: " + i.pago);
            System.out.println("Pago total de horas extra: " + i.pagoextra);

        }  
        //termina la introduccion de datos
                
        
    }
    
    public static class Empleado{
        String nomEmp;
        int horas;
        int horasextra;
        int pagoextra;
        int pago;
        
        public Empleado(String nombre, int horas, int horasextra){
            this.nomEmp = nombre;
            this.horas = horas;
            this.horasextra = horasextra;
            this.pago = Calcularhorasn(horas);
            this.pagoextra = Calcularhorasextra(horasextra);

        }
        
        public int Calcularhorasextra(int horas){
            if(horas > 10){
                int extra = horas - 10;
                pagoextra = extra * 8500;
                pagoextra = pagoextra + 70000;
            }else{
                pagoextra = horas * 7000;
            }
            return pagoextra;
            
        }
        
        public int Calcularhorasn(int horas){
            pago = horas * 6000;
            return pago;
        }
        
        
    }
    
}
