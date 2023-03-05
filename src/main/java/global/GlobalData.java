package global;

import java.util.ArrayList;
import java.util.List;

import com.ecom.ecomspringboot.entity.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart=new ArrayList<Product>();
		
	}

}
