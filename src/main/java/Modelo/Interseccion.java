package Modelo;

public class Interseccion {

	private boolean ocuped;
	private boolean black;
	private boolean counted;
	private Interseccion northIntersection;
	private Interseccion southIntersection;
	private Interseccion eastIntersection;
	private Interseccion westIntersection;
	private int horizontalPosition;

	public Interseccion(int horizontalPosition) {
		ocuped = false;
		black = false;
		northIntersection = null;
		southIntersection = null;
		eastIntersection = null;
		westIntersection = null;
		counted = false;
		this.horizontalPosition = horizontalPosition;
	}



	//					 //
	//		SETTERS		 //
	//					 //

	public void putPiece(boolean isBlack) {
		ocuped = true;
		black = isBlack;
	}

	public void capturePiece() {
		ocuped = false;
	}

	public void setNorthIntersection(Interseccion northIntersection) {
		this.northIntersection = northIntersection;
	}

	public void setSouthIntersection(Interseccion southIntersection) {
		this.southIntersection = southIntersection;
	}

	public void setEastIntersection(Interseccion eastIntersection) {
		this.eastIntersection = eastIntersection;
	}

	public void setWestIntersection(Interseccion westIntersection) {
		this.westIntersection = westIntersection;
	}

	//					 //
	//		GETTERS		 //
	//					 //


	public boolean isOcuped() {
		return ocuped;
	}

	public boolean isBlack() {
		return black;
	}

	public boolean isCounted() {
		return counted;
	}

	public int getHorizontalPosition() {
		return horizontalPosition;
	}
}
