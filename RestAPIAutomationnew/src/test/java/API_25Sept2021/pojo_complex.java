package API_25Sept2021;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class pojo_complex 
{
	public static void main(String[] args) 
	{
		Address address=new Address();
		address.setHouseno("2109");
		address.setLandmark("swastik vihar");
		address.setSector("sector 45");
		
		
		Basic_information basic=new Basic_information();
		basic.setId("1199");
		basic.setAge("33");
		basic.setFirstname("amit");
		basic.setLastname("malhotra");
		basic.setDesignation("team lead");
		basic.setAddress(address);
		
		
		Response r=
				given ()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
				.post("http://localhost:3000/APIFolks");
		
		System.out.println("status code is ");
		System.out.println(r.statusCode());
		System.out.println("response is");
		System.out.println(r.asString());

	}

}
