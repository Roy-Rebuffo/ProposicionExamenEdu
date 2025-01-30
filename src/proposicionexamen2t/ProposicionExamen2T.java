package proposicionexamen2t;

import java.util.Scanner;

public class ProposicionExamen2T {

    public static void main(String[] args) {
        menu();
    }
    
    public static void ejercicio1(int tNum[], int MAYOR, int MENOR, int C_NUM, 
            double T_NUM, double M_MEDIA, int pos, Scanner dato){
        int pos_mayor = 0;
        int pos_menor = 0;
        
        System.out.println("Resolucion del ejercicio 1");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("\t\tApartado a)");
        
        for (int i = 0; i < tNum.length; i++) {
            System.out.println("\t\t"+tNum[i]);
            if (tNum[i]>MAYOR) {
                MAYOR = tNum[i];
                pos_mayor = i;
            }
        }
        System.out.println("\t\tEl mayor de los numeros es: " + MAYOR);
        System.out.println("\t\tSu posicion es: " + pos_mayor);
        
        System.out.println("\t\t==========================");
        System.out.println("");
        System.out.println("\t\tApartado b)");
        
        for (int i = 0; i < tNum.length; i++) {
            if (tNum[i]<=MENOR) {
                MENOR = tNum[i];
                pos_menor = i;
            }
        }
        System.out.println("\t\tEl menor de los numeros es: " + MENOR);
        System.out.println("\t\tSu posicion es: " + pos_menor);
        
        System.out.println("\t\t==========================");
        System.out.println("");
        System.out.println("\t\tApartado c)");
        
        for (int i = 0; i < tNum.length; i++) {
            C_NUM ++;
            T_NUM += tNum[i];
        }
        M_MEDIA = T_NUM/C_NUM;
        
        System.out.println("\t\tLa media de los numeros es: " + M_MEDIA);
        
        System.out.println("\t\t==========================");
        System.out.println("");
        System.out.println("\t\tApartado d)");
        
        System.out.print("\t\tIndica la posicion del elemento del array que quieres editar: ");
        pos = dato.nextInt();
        
        System.out.print("\t\tIntroduce el nuevo valor: ");
        int nuevoValor = dato.nextInt();
        
        tNum[pos] = nuevoValor;
        
        System.out.print("\t\tLa lista editada es: ");
        for (int num : tNum) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void menu(){//procedimiento
        int opcion=-1;
        Scanner dato = new Scanner(System.in);
        
        //crear array con 100 notas aleatorias
        int [] tNum = new int[10];
        for (int i = 0; i < tNum.length; i++) {
            tNum[i] = alea(0, 10);
        }
        
        while(opcion!=0){//estructura MIENTRAS
            System.out.println("MENÚ");
            System.out.println("====\n");
            System.out.println("\t(1) Ejercicio 1.- Ejercicio1");
            System.out.println("\t(2) Ejercicio 2.- Ordenar Asc. por Nombres");
            System.out.println("\t(3) Ejercicio 3.- Ordenar Desc. por Notas");
            System.out.println("\t(0) SALIR");
            System.out.print("\nSeleccione la opción elegida: ");
            opcion=dato.nextInt();
            switch(opcion){//estructura CONDICIONAL MÚLTIPLE
                case 1:
                    int MAYOR = 0;
                    int MENOR = 101;
                    int C_NUM = 0;
                    double T_NUM = 0;
                    double M_MEDIA = 0;
                    int pos = 0;
                    
                    ejercicio1(tNum, MAYOR, MENOR, C_NUM, T_NUM, M_MEDIA, pos, dato);
                    break;
                case 2:
                    //ejercicio2(tNum, MENOR);
                    break;
                case 3:
                    //ordenarNotaDesc(tNombres,tNotas);
                    break;
                case 4:
                    /*for(int i=0;i<tNotas.length;i++){
                        if (tNotas[i]>=5){
                            apr++;
                        }
                    }*/
                    //aprobados(tNombres,tNotas,apr);
                    break;
                case 5:
                    /*for(int i=0;i<tNotas.length;i++){
                        if (tNotas[i]<5){
                            sus++;
                        }
                    }*/
                    //suspensos(tNombres,tNotas,sus);
                    break;
                case 6:
                    //insertar(tNombres, tNotas, dato);
                    break;
                case 7:
                    //eliminar(tNombres, tNotas, dato);
                    break;
                case 8:
                    //ejercicio_8(2);
                    break;
                case 9:
                    //ejercicio_9(2);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Elija un número entre 1 y 8");
            }
            for(int i=1;i<=3;i++){//estructura PARA
                System.out.println("");
            }
        }
    }
    public static int alea(int li, int ls){//función (método)
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
}