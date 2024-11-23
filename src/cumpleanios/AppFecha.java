/*
@Author:Jorge Revelo
@Version:1.0.0
El presente codigo calcula la edad de una persona,
considera las restricciones por ingreso de fecha.
 */
package cumpleanios;
public class AppFecha {
    public static void main(String[] args) {
        Fecha fut1 = new Fecha(31, 10, 2025);
        Fecha fut2 = new Fecha(29, 2, 2023);
        Fecha fut3 = new Fecha(-1, 10, 2020);
        Fecha fut4 = new Fecha(31, -1, 2020);
        Fecha fut5 = new Fecha(31, 10, -1);
        Fecha fut6 = new Fecha(30, 10, 2010);
        Fecha fut7 = new Fecha(30, 12, 2010);
        Fecha fut9 =new Fecha(1,2,2010);
        Fecha fut10 =new Fecha(21,2,2010);

        fut1.getEdad();
        fut2.getEdad();
        fut3.getEdad();
        fut4.getEdad();
        fut5.getEdad();
        fut6.getEdad();
        fut7.getEdad();
        fut9.validarFecha();

        fut2.validarFecha();

    }
}
