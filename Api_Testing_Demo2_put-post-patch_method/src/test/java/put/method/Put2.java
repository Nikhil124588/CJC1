package put.method;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put2 {
  @Test
  public void f() {
	  RequestSpecification req=RestAssured.given();
	  req.header("Content-type","application/json");
	  JSONObject json=new JSONObject();	
	  json.put("id", "8");
	  json.put("name", "nikhil12");
	  json.put("addr", "amt-pune");
	  req.body(json.toJSONString());
	  Response res=req.put("http://localhost:8086/put");
	  int st=res.getStatusCode();
	  System.out.println(st);
  }
}
