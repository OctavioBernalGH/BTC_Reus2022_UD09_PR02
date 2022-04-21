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

			public static SerieClass [] series 				= new SerieClass[5];
			public static VideojuegoClass [] videojuegos 	= new VideojuegoClass [5];
			public static VideojuegoClass videojuegoMasH	= new VideojuegoClass("", 0, "", "");
			public static SerieClass serieMasTemporadas		= new SerieClass("", 0, "", "");	

	public static void main(String[] args) {
		
		//crear dos arrays, uno de series y otro de videojuegos con 5 posiciones cada uno
		
		
		
		//Crear un objeto por cada posición usando diferentes constructores
		
			//Creating serieClass objects
			SerieClass dexter 			= new SerieClass("dexter", 6, "intriga", "antono");
			SerieClass sonsOfAnarchy 	= new SerieClass("Sons of anarchy" , 6, "thriler", "ana");
			SerieClass you 				= new SerieClass("You", "pepe");
			SerieClass theBoys 			= new SerieClass("The boys", "superman");
			SerieClass invencible 		= new SerieClass();
			
			//Asigning to the array
			series[0] = dexter;
			series[1] = sonsOfAnarchy;
			series[2] = you;
			series[3] = theBoys;
			series[4] = invencible;
			
			//Creating VideojuegoClass objects
			VideojuegoClass lol			= new VideojuegoClass("lol", 400);
			VideojuegoClass moo			= new VideojuegoClass("Master of orion 2", 2000);
			VideojuegoClass sims		= new VideojuegoClass("Sims", 0, "Muy malo", "no lo quiero saber");
			VideojuegoClass simCity		= new VideojuegoClass("Sim city", 400, "Estrategia", "Cocacola");
			VideojuegoClass mGT			= new VideojuegoClass();
			
			//Asigning to the array
			videojuegos[0] = lol;
			videojuegos[1] = moo;
			videojuegos[2] = sims;
			videojuegos[3] = simCity;
			videojuegos[4] = mGT;
		
		//Entregar algunos videojuegos y series con el método entregar();
			
			series[0]		.entregar();
			videojuegos[1]	.entregar();
			series[2]		.entregar();
			videojuegos[3]	.entregar();
			series[4]		.entregar();
		
		//Contar cuantos videojuegos y series hay entregados y devolverlos
			contarYEntregarVideojuegos(videojuegos);
			contarYEntregarSeries(series);
			videojuegoMasHoras();
			serieMasTemporadas();
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
	/*Mostrar por pantalla con el método toString() el videojuego con mas horasEstimadas 
	 *  y la serie con más numTemp usando el método toString();
	 */
	private static void videojuegoMasHoras() {
			for(VideojuegoClass target: videojuegos) {
				if(target.compareTo(videojuegoMasH)) {
					videojuegoMasH = target;
				}
			}
			System.out.println("Videojuego con mas horas");
			System.out.println(videojuegoMasH.toString());
	}
	private static void serieMasTemporadas() {
		for(SerieClass target: series) {
			if(target.compareTo(serieMasTemporadas)) {
				serieMasTemporadas = target;
			}
		}
		System.out.println("Serie con mas temporadas");
		System.out.println(serieMasTemporadas.toString());
}

}
