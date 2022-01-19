package DeSerializingTests;

import java.util.List;

import org.testng.annotations.Test;

import DeSerializePojo.DataPojo;
import DeSerializePojo.ListUserPojo;
import io.restassured.RestAssured;

public class DeserializeTest {

	
	@Test
	public void DeserializationTest() {
		
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		
		
		ListUserPojo pojo =RestAssured.given().when().get().as(ListUserPojo.class);
		
	     //System.out.println(pojo.toString());
			/*
			 * System.out.println(pojo.getPage()); 
			 * System.out.println(pojo.getTotal());
			 * System.out.println(pojo.getData()); 
			 * System.out.println(pojo.getSupport());
			 */
		
		
		System.out.println("List of Pojo"+pojo.getData()); 
		
		
		List<DataPojo> list  =pojo.getData();
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
			
		}
	}
}


