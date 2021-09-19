package API_18Sept2021;

import static com.jayway.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import java.io.FileReader;

public class Assignmnet_array_json 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f=new File("../RestAPIAutomationnew/Bodydata.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject ob=new JSONObject(js);
		
		Response r=
				given ()
				.contentType(ContentType.JSON)
				.body(ob.toString())
				.when()
				.post("http://localhost:3000/APIFolks");
				
				System.out.println("status code is ");
				System.out.println(r.statusCode());
				System.out.println("response is");
				System.out.println(r.asString());
		
	}

}
