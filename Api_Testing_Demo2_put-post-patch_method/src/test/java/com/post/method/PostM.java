package com.post.method;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostM {
  @Test
  public void post() {
	 RequestSpecification req=RestAssured.given();
	 req.header("Content-type","application/json");
	 JSONObject json=new JSONObject();
	 json.put("id", "1");
	 json.put("name", "abc");
	 req.body(json.toJSONString());
	 Response rs=req.post("https://reqres.in/api/users");
	 int stcode=rs.getStatusCode();
	 Assert.assertEquals(stcode, 201);
	  
  }
}
