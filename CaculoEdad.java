import java.util.Calendar;
import java.util.GregorianCalendar;
 
public class calcularEdad {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Mostramos el resultado de llamar a la funci�n calcular pasando
		// como parametro la fecha de nacimiento YYYY-MM-DD
		System.out.println(calcular(new GregorianCalendar(1970,02,14)));
	}
 
    public static int calcular(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();
 
        // C�lculo de las diferencias.
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
 
        // Hay que comprobar si el d�a de su cumplea�os es posterior
        // a la fecha actual, para restar 1 a la diferencia de a�os,
        // pues a�n no ha sido su cumplea�os.
 
        if(months < 0 // A�n no es el mes de su cumplea�os
           || (months==0 && days < 0)) { // o es el mes pero no ha llegado el d�a.
            years--;
        }
        return years;
    }
}