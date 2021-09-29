package API_25Sept2021;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class pojo_array 
{
	public static void main(String[] args) 
	{
Address[] address=new Address[2];//Size declared
address[0]=new Address();// 0th is storing first object

address[0].setHouseno("2109");
address[0].setLandmark("swastik vihar");
address[0].setSector("sector 45");

address[1]=new Address();// 1th is storing second object

address[1].setHouseno("2100");
address[1].setLandmark("chandigarh");
address[1].setSector("sector 49");

		
		
		Basic_information_inform_array basic1=new Basic_information_inform_array();
		basic1.setId("10");
		basic1.setAge("33");
		basic1.setFirstname("amit");
		basic1.setLastname("malhotra");
		basic1.setDesignation("team lead");
		basic1.setAddress(address);
		
		
		Response r=
				given ()
				.contentType(ContentType.JSON)
				.body(basic1)
				.when()
				.post("http://localhost:3000/APIFolks");
		
		System.out.println("status code is ");
		System.out.println(r.statusCode());
		System.out.println("response is");
		System.out.println(r.asString());

		
	}

}
