package PracticalTask9;
/*Create a class Plant, which includes fields int size, 
 * Color color and Type type, and constructor where these fields are initialized.
 * Color and type are Enum. Override the method toString( ). 
 * Create classes ColorException and TypeException and describe there all possible colors and types of plants.
 * In the method main create an array of five plants. Check to work your exceptions.
 */

public class Plant {
	private int size;
	private Color color;
	private Type type;
	
	public Plant(int size, String color, String type) throws ColorException, TypeException {		
		this.size = size;
		this.color = colorException(color);
		this.type = typeException(type);
	}

	@Override
	public String toString() {
		return "Plant [size = " + size + ", color = " + color + ", type = " + type + "]";
	}
	private Color colorException(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.BLUE;
		case "green":
			return Color.GREEN;
		case "white":
			return Color.WHITE;

		default:
		throw new ColorException("Color blue, green, white ");
		}
		
	}
	private Type typeException(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "type1":
			return Type.TYPE1;
		case "type2":
			return Type.TYPE2;	
		case "type3":
			return Type.TYPE3;

		default:
		throw new TypeException("Type type1, type2, type3");
		}
		
		
	}
	
}
