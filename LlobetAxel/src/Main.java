import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Chair uno=new Chair("juanito",20,200.0,false);
        Desk dos=new Desk("jorgito",7,1500.0,1.4,2.0);
        Printer tres=new Printer("X-314",10,1000.0,"Sony",120);
        Notebook cuatro=new Notebook("XT-1050",8,2000.0,"Samsung",500);
        ArrayList<Products> lista=new ArrayList<>();
        lista.add(uno);
        lista.add(dos);
        lista.add(tres);
        lista.add(cuatro);
        for(Products i: lista){
            System.out.println(i.toString());
        }
        System.out.println("El precio con descuento te queda en "+uno.descuento(10)+"$");
        System.out.println("El precio con descuento te queda en "+tres.descuento(20)+"$");
        for(Products i: lista){
            System.out.println(i.toString());
            if(i instanceof Chair){
                i.updatePrice(5);
            }else {
                if(i instanceof Desk) {
                    i.updatePrice(10);
                }else {
                    if(i instanceof Printer) {
                        i.updatePrice(15);
                    }else {
                        i.updatePrice(20);
                    }
                }
            }
            System.out.println(i.toString());
        }

    }
}