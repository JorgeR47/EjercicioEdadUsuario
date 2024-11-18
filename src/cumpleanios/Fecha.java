package cumpleanios;
import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    int anioActual = Calendar.getInstance().get(Calendar.YEAR);

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean validarFecha() {
        // Verificar rango del mes
        if (mes < 1 || mes > 12) {
            return false;
        }

        // Obtener el número de días del mes
        int cantidadTotalDiasPorMes = obtenerDiasDelMes(mes, anio);

        // Verificar rango del día
        if (dia < 1 || dia > cantidadTotalDiasPorMes) {
            return false;
        }
        // Verificar rango del anio, la funcion require un return
        return anio > 0 && anio <= anioActual;
    }

    public static final int obtenerDiasDelMes(int mes, int anio) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }


    public void getEdad() {
        // Validar si la fecha es válida
        if (!validarFecha()) {
            System.out.println("La fecha no es válida.");
        }else {
            // Calcular diferencia en anios
            int edad = anioActual - this.anio;
            // Ajustar edad según diferencia en días calendario
            edad += getDiferenciaDiasCalendario();

            System.out.println("La edad es: " + edad);
        }
    }

    // Método para calcular la diferencia de días entre la fecha actual y la fecha de nacimiento
    public int getDiferenciaDiasCalendario() {
        Calendar fechaActual = Calendar.getInstance();
        int mesActual = fechaActual.get(Calendar.MONTH) + 1; // Se añade 1 porque Calendar empieza en 0
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

        int diasCalendarioFechaActual = obtenerDiasHastaFecha(mesActual, diaActual, fechaActual.get(Calendar.YEAR));
        int diasCalendarioFechaNacimiento = obtenerDiasHastaFecha(this.mes, this.dia, this.anio);

        // Si el resultado es positivo o cero, la fecha de cumpleanios ya ha pasado este anio
        return ((diasCalendarioFechaActual - diasCalendarioFechaNacimiento) >= 0) ? 0 : -1;


    }

    public int obtenerDiasHastaFecha(int mesCalendario, int diaCalendario, int anioCalendario) {
        int diasTranscurridos = 0;

        for (int contadorDeMeses = 1; contadorDeMeses < mesCalendario; contadorDeMeses++) {
            diasTranscurridos += obtenerDiasDelMes(contadorDeMeses, anioCalendario);
        }
        diasTranscurridos += diaCalendario;
        return diasTranscurridos;
    }
}