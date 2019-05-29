package Ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Creo que array de productos
        Producto[] productos = new Producto[3];

        //Creo los elementos
        productos[0] = new Perecedero(3,"producto 1", 10);
        productos[1] = new Perecedero(1, "producto 2", 20);
        productos[2] = new NoPerecedero("tipo 1", "producto 3", 5);

        //Calculo el precio
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            total += productos[i].calcular(5); //Polimorfismo
            System.out.println(" el producto "+ productos[i].getNombre()+" su precio seria "+productos[i].calcular(5));
        }

        /*Para diferenciar los distintos tipos de objetos en el array, utilizamos instanceof*/
        for (int i = 0; i < productos.length; i++) {
            if(productos[i] instanceof Perecedero)
                System.out.println(productos[i].getNombre()+" Este producto es perecedero");
           else
                System.out.println(productos[i].getNombre()+" Este producto es noperecedero");
        }

        //Mostramos la informacion
        System.out.println(" El total es: "+total);

    }
}
