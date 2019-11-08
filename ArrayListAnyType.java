import java.util.ArrayList;

public class ArraylistPersonalized {

	ArrayList<Object> arrayList;

    // Instance the variable 
    public ArraylistPersonalized() {

	arrayList = new ArrayList<Object>();

}

// Adding an Object to the list
public void add(Object obj) {
	arrayList.add(obj);
}

	// Get List of all Int
	public ArrayList<Object> getAllInt() {

		ArrayList<Object> integerList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof Integer) {
				integerList.add(this.arrayList.get(i));
			}
		}
		return integerList;
	}

	// Get list of all String
	public ArrayList<Object> getAllString() {

		ArrayList<Object> stringList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof String) {
				stringList.add(this.arrayList.get(i));
			}
		}
		return stringList;
	}

	// Get list of all Short
	public ArrayList<Object> getAllShort() {

		ArrayList<Object> shortList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof Short) {
				shortList.add(this.arrayList.get(i));
			}
		}
		return shortList;
	}

	// Get list of all Byte
	public ArrayList<Object> getAllByte() {

		ArrayList<Object> byteList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof Byte) {
				byteList.add(this.arrayList.get(i));
			}
		}
		return byteList;
	}

	// Get list of all Boolean
	public ArrayList<Object> getAllBoolean() {

		ArrayList<Object> booleanList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof Boolean) {
				booleanList.add(this.arrayList.get(i));
			}
		}
		return booleanList;
	}

	// Get list of all Long
	public ArrayList<Object> getAllLong() {

		ArrayList<Object> longList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof Long) {
				longList.add(this.arrayList.get(i));
			}
		}
		return longList;
	}

	// Get list of all Float
	public ArrayList<Object> getAllFloat() {

		ArrayList<Object> floatList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof Float) {
				floatList.add(this.arrayList.get(i));
			}
		}
		return floatList;
	}

	// Get list of all Double
	public ArrayList<Object> getAllDouble() {

		ArrayList<Object> doubleList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof Double) {
				doubleList.add(this.arrayList.get(i));
			}
		}
		return doubleList;
	}

	// Get list of all Character
	public ArrayList<Object> getAllCharacter() {

		ArrayList<Object> characterList = new ArrayList<Object>();

		for (int i = 0; i < this.arrayList.size(); i++) {
			if (this.arrayList.get(i) instanceof Character) {
				characterList.add(this.arrayList.get(i));
			}
		}
		return characterList;
	}

// Remove Object from the List
public void remove(Object obj) {
	arrayList.remove(obj);
}

}