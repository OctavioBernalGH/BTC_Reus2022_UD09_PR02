package App;

import Class.SerieClass;
import Class.VideojuegoClass;

/*
 * 
 * Ejercicio 2 - Control de alquiler de videojuegos y series
 * 
 * @version:	0.0.1, @fecha: 16/04/2022
 * @author: Octavio Bernal / David Dalmau / Oriol López
 * 
 */


public class MainApp {

	public static void main(String[] args) {
		
		//TODO: crear dos arrays, uno de series y otro de videojuegos con 5 posiciones cada uno
		
		SerieClass [] series 			= new SerieClass[5];
		VideojuegoClass [] videojuegos 	= new VideojuegoClass [5];
		
		//TODO: Crear un objeto por cada posición usando diferentes constructores
		
			//Creating serieClass objects
			SerieClass dexter 			= new SerieClass("tetanic", 6, "drama", "paco");
			System.out.println(dexter);
			SerieClass sonsOfAnarchy 	= new SerieClass("frodo" , 6, "terror", "jose");
			SerieClass you 				= new SerieClass();
			SerieClass theBoys 			= new SerieClass();
			SerieClass invencible 		= new SerieClass();
			
			//Asigning to the array
			series[0] = dexter;
			

			series[1] = sonsOfAnarchy;
			series[0].compareTo(sonsOfAnarchy);
			series[2] = you;
			series[3] = theBoys;
			series[4] = invencible;
			
			//Creating VideojuegoClass objects
			VideojuegoClass lol			= new VideojuegoClass();
			VideojuegoClass moo			= new VideojuegoClass();
			VideojuegoClass sims		= new VideojuegoClass();
			VideojuegoClass simCity		= new VideojuegoClass();
			VideojuegoClass mGT			= new VideojuegoClass();
			
			//Asigning to the array
			videojuegos[0] = lol;
			videojuegos[1] = moo;
			videojuegos[2] = sims;
			videojuegos[3] = simCity;
			videojuegos[4] = mGT;
		
		//TODO: Entregar algunos videojuegos y series con el método entregar();
			
			series[0]		.entregar();
			videojuegos[1]	.entregar();
			series[2]		.entregar();
			videojuegos[3]	.entregar();
			series[4]		.entregar();
		
		//TODO: Contar cuantos videojuegos y series hay entregados y devolverlos
			contarYEntregarVideojuegos(videojuegos);
			contarYEntregarSeries(series);
		
		/*TODO: Mostrar por pantalla con el método toString() el videojuego con mas horasEstimadas 
		 *  y la serie con más numTemp usando el método toString();
		 */
			

	}
//Methods
	//Contando y entregando Videojuegos
	private static void contarYEntregarVideojuegos(VideojuegoClass[] videojuegos) {
		int contVideoJuegos=0;
		
		for(VideojuegoClass tarjet : videojuegos) {
			
			if(tarjet.isEntregado()) {
				tarjet.devolver();
				contVideoJuegos++;
			}
		}
		System.out.println("Habia "+contVideoJuegos+" videojuegos entregados");
	}

	private static void contarYEntregarSeries(SerieClass[] series) {
		int contSeries=0;
		for(SerieClass tarjet : series) {
			
			if(tarjet.isEntregado()) {
				tarjet.devolver();
				contSeries++;
			}
		}
		System.out.println("Habia "+contSeries+" series entregadas");
	}

}
