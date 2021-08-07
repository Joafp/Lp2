
import java.util.Scanner;
public class Lab2Ejercicio2 {
    public static void main(String []args ){
        int nroP=-1;
        int cantidad=0;
        lista nueva=new lista();
        Scanner aux=new Scanner(System.in);
        System.out.println("Para dejar de cargar ingrese en numero del producto 0");
        System.out.println("Ingrese el numero del producto");
        nroP=aux.nextInt();
        while (nroP!=0){
            System.out.println("Ingrese la cantidad de productos comprados");
            cantidad=aux.nextInt();
            switch (nroP){
                case 1:
                    nueva.agregar(nroP, cantidad, 10000*cantidad);
                    break;
                case 2:
                    nueva.agregar(nroP, cantidad, 15000*cantidad);
                    break;
                case 3:
                    nueva.agregar(nroP, cantidad, 20000*cantidad);
                    break;
                case 4:
                    nueva.agregar(nroP, cantidad, 25000*cantidad);
                    break;
                case 5:
                    nueva.agregar(nroP, cantidad, 30000*cantidad);
                    break;
            }
            System.out.println("Ingrese el numero del producto");
            nroP=aux.nextInt();
        }
        nueva.imprimir();
    }
}
class nodo{
    int nroP;
    int cantidad;
    int monto;
    nodo siguiente;
    nodo (int n,int c,int p){
        nroP=n;
        cantidad=c;
        monto=p;
        siguiente=null;
    }
    public int getnro(){
        return nroP;
    }
    public int getcantidad(){
        return cantidad;
    }
    public int getmonto(){
        return monto;
    }
    public nodo getsiguiente(){
        return siguiente;
    }
    public void insertarsgt(nodo nuevo){
        if (nuevo!=this){
            this.siguiente=nuevo;
        }else{
            System.out.println("No se puede apuntar a si mismo");
        }
    }
}
class lista{
    nodo cabeza;
    lista(){
        cabeza=null;
    }
    public void agregar(int nroP,int c,int precio){
        nodo temp=cabeza;
        cabeza= new nodo(nroP,c,precio);
        cabeza.insertarsgt(temp);
    }
    public void imprimir(){
        if (cabeza==null){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("Se cargaron los siguientes productos:");
            nodo actual=this.cabeza;
            while (actual!=null){
                System.out.println("El producto nro "+actual.getnro()+" con una cantidad de "+actual.getcantidad()+" productos tiene un precio final de "+actual.getmonto());
                actual=actual.getsiguiente();
            } 
        }
      
    }
}
