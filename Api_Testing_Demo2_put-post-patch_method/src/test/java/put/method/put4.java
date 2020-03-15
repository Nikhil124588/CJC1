package put.method;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class put4 {
  @Test
  public void f() {
	 RequestSpecification req= RestAssured.given();
	 req.header("Content-type","application/json");
	 JSONObject json=new JSONObject();
	 json.put("id","15");
	 json.put("addr","amravati");
	json.put("name", "gbh");
	 req.body(json.toJSONString());
	 Response res=req.patch("http://localhost:8086/patch/15");
	 int st=res.getStatusCode();
	 System.out.println(st);
	 
	  
  }
}
