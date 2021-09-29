package API_25Sept2021;

import static com.jayway.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

//firstly we will prepare simple body data using Pojo class
public class pojo_simple 
{
	public static void main(String[] args) 
	{
		Basic_information basic=new Basic_information();
		basic.setId("1190");
		basic.setAge("33");
		basic.setFirstname("akhil");
		basic.setLastname("malhotra");
		basic.setDesignation("team lead");
		
		
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
