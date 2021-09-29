package API_18Sept2021;

import static com.jayway.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Assignment_complexjsonfile 

{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f=new File("../RestAPIAutomationnew/comple_bodydata.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject ob=new JSONObject(js);
		
		Random random=new Random();
		Integer i=random.nextInt();
		 
		String ob1=ob.toString().replaceAll(Pattern.quote("{{"+"id"+"}}"),i.toString());
		
		
		Response r=
				given ()
				.contentType(ContentType.JSON)
				.body(ob1.toString())
				.when()
				.post("http://localhost:3000/APIFolks");
				
				System.out.println("status code is ");
				System.out.println(r.statusCode());
				System.out.println("response is");
				System.out.println(r.asString());
		
				
	}

}
