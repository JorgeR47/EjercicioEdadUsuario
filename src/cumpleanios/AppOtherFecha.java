package cumpleanios;
public class AppOtherFecha {
    public static void main(String[] args) {
        Fecha fut1 = new Fecha(31, 10, 2025);
        Fecha fut2 = new Fecha(29, 2, 2023);
        Fecha fut3 = new Fecha(-1, 10, 2020);
        Fecha fut4 = new Fecha(31, -1, 2020);
        Fecha fut5 = new Fecha(31, 10, -1);
        Fecha fut6 = new Fecha(30, 10, 2010);
        Fecha fut7 = new Fecha(30, 12, 2010);

        fut1.getEdad();
        fut2.getEdad();
        fut3.getEdad();
        fut4.getEdad();
        fut5.getEdad();
        fut6.getEdad();
        fut7.getEdad();

    }
}
