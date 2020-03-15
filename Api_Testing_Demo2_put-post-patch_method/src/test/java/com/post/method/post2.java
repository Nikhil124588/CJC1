package com.post.method;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post2 {
  @Test
  public void f() {
	  
	  RequestSpecification req=RestAssured.given();
	  req.header("Content-type","application/json");
	  JSONObject json=new JSONObject();
	  json.put("id", "14");
	  json.put("addr", "warje");
	  json.put("name", "nik");
	  req.body(json.toJSONString());
	  Response res=req.post("http://localhost:8086/post");
	 int st= res.getStatusCode();
	  System.out.println(st);
	  
  }
}
