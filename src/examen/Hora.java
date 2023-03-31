package examen;
/**
 * Esta clase Hora determinara la validez de la hora.
 * 
 * @author Alejandro Martinez
 *
 *@version 1.0
 */
public class Hora {
	/**
	 * Representa la hora y en funcion del resultado si es valida o no.
	 */
	public static boolean horaValida;

	/**
	 * Este metodo realiza la comprobacion de la hora en funcion de si los datos proporcionados son validos o no. 
	 * 
	 * @param segundos representa la cantidad de segundos 
	 * @param minutos representa la cantidad de minutos 
	 * @param horas representa la cantidad de horas
	 * 
	 * @return true o false dependiendo de los caminos que tome  la variable hora valida.
	 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}