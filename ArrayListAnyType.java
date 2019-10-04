import java.util.ArrayList;

public class ArraylistPersonalized {

	ArrayList<Object> arrayList;

    public ArraylistPersonalized() {

	arrayList = new ArrayList<Object>();

}

public void add(Object obj) {
	arrayList.add(obj);
}

public ArrayList<Object> getAllInt(){
		
		ArrayList<Object> IntegerList = new ArrayList<Object>();
		
		for (int i = 0; i < this.arrayList.size() ; i++) {
		    if (this.arrayList.get(i) instanceof Integer) {
		    	IntegerList.add(this.arrayList.get(i));
		    }
		}
		return IntegerList;
	}

public void remove(Object obj) {
	arrayList.remove(obj);
}

}