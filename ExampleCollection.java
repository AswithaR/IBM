package collections;
import java.util.*;

public class ExampleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();//it can only store objects so wrapper class is used
        arr.add(33);
        arr.add(22);
		ArrayList<Integer> brr=new ArrayList<>();//it can only store objects so wrapper class is used
        brr.add(13);
        brr.add(12);
        arr.addAll(brr);
        System.out.println(arr);


	}

}
