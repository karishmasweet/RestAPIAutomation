package API_18Sept2021;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static io.restassured.RestAssured.*;

import static com.jayway.restassured.RestAssured.given;

public class Assignmnet_arrayform_orgjson 
{
public static void main(String[] args) 
{
	JSONObject innerobject1=new JSONObject();
	innerobject1.put("houseno", "12");
	innerobject1.put("landmark", "sector23");
	innerobject1.put("type", "Primary address");
	
	JSONObject innerobject2=new JSONObject();
	innerobject2.put("houseno", "12");
	innerobject2.put("landmark", "sector23");
	innerobject2.put("type", "Seconary address");
	
	JSONArray address=new JSONArray();
	address.put(0,innerobject1);
	address.put(1,innerobject2);
	
	JSONObject karishma=new JSONObject();
	karishma.put("firstname","kanikasanjay");
	karishma.put("lastname","vermasharma");
	karishma.put("age","312");
	karishma.put("id","20009799788");
	karishma.put("Company name","roundclassonejhjh");
	karishma.put("Address",address);
	
	Response r=
			given ()
			.contentType(ContentType.JSON)
			.body(karishma.toString())
			.when()
			.post("http://localhost:3000/APIFolks");
			
			System.out.println("status code is ");
			System.out.println(r.statusCode());
			System.out.println("response is");
			System.out.println(r.asString());
	
	
}
}
