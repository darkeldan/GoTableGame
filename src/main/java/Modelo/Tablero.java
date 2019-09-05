package Modelo;

import java.util.HashMap;
import java.util.Map;

public class Tablero {

	Interseccion[][] tablero;

	public Tablero(int type) {
		int size = 9;
		switch(type) {
			case 1:
				size = 19;
				break;
			case 2:
				size = 13;
				break;
			case 3:
				size = 9;
				break;
			case 4:
				size = 7;
				break;
			default:
				break;
		}
		createBoard(size);
	}

	public void createBoard(int size) {
		tablero = new Interseccion[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				Interseccion interseccion = new Interseccion(j);

				if (i == 0) {

					interseccion.setNorthIntersection(null);

					if (j == 0) interseccion.setWestIntersection(null);
					else if (j == size-1) {
						interseccion.setWestIntersection(tablero[i][j-1]);
						interseccion.setEastIntersection(null);
						tablero[i][j-1].setEastIntersection(interseccion);
					}
					else {
						interseccion.setWestIntersection(tablero[i][j-1]);
						tablero[i][j-1].setEastIntersection(interseccion);
					}

				} else if (i == size-1) {

					interseccion.setNorthIntersection(tablero[i-1][j]);
					interseccion.setSouthIntersection(null);
					tablero[i-1][j].setSouthIntersection(interseccion);

					if (j == 0) interseccion.setWestIntersection(null);
					else if (j == size-1) {
						interseccion.setWestIntersection(tablero[i][j-1]);
						interseccion.setEastIntersection(null);
						tablero[i][j-1].setEastIntersection(interseccion);
					}
					else {
						interseccion.setWestIntersection(tablero[i][j-1]);
						tablero[i][j-1].setEastIntersection(interseccion);
					}

				} else {

					interseccion.setNorthIntersection(tablero[i-1][j]);
					tablero[i-1][j].setSouthIntersection(interseccion);

					if (j == 0) interseccion.setWestIntersection(null);
					else if (j == size-1) {
						interseccion.setWestIntersection(tablero[i][j-1]);
						interseccion.setEastIntersection(null);
						tablero[i][j-1].setEastIntersection(interseccion);
					}
					else {
						interseccion.setWestIntersection(tablero[i][j-1]);
						tablero[i][j-1].setEastIntersection(interseccion);
					}
				}
			}
	}


}
