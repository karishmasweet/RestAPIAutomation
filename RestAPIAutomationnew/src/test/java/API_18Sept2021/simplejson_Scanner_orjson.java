package API_18Sept2021;

import static io.restassured.RestAssured.*;

import java.util.Scanner;

import org.json.JSONObject;



public class simplejson_Scanner_orjson 
{
public static void main(String[] args) 
{
	JSONObject karishma=new JSONObject();
	System.out.println("Please enter first name");
	Scanner s=new Scanner(System.in);
	String firstname=s.nextLine();
	String lastname=s.nextLine();
	karishma.put("firstname",firstname);
	karishma.put("lastname",lastname);
	karishma.put("age","30");
	karishma.put("id","2000278");
	karishma.put("Company name","clicklabs");
	karishma.put("Address", "chandigarh");
	
	System.out.println(karishma.toString());
	

}

}
