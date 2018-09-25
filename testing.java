import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class testing{
	
	public static void foo(){
		throw new RuntimeException();
	}
	public static void main(String [] args){
	foo();
	}
}