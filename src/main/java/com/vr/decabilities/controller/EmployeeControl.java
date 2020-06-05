package com.vr.decabilities.controller;

import java.net.URI;
import java.net.URISyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
//TODO: Rate LImiting
//TODO: Authentication
//todo: caching
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/employees")
public class EmployeeControl
{
//
//  @Autowired
//  private EmployeeService service;
  //TODO: Pagination, Filtering, Sorting
  //TODO: Limiting which fields are returned by the API
//  TODO: gzip compression
//  TODO: Link header introduced by RFC 5988.
//  TODO: Expand when to return ids or expanded inline objects
  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/")
  public void getEmployees(){

  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/{employee-id}")
  public void getEmployee(@PathVariable("employee-id") Long id){

  }
//  TODO: Return location header with the object url
//  TODO: Content-Type header be set to application/json
//  TODO: Idempotent request 409 conflict
//  TODO: 406 or 422 to for wrong request
  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("/")
  public ResponseEntity<String> addEmployee() throws URISyntaxException {
    HttpHeaders headers = new HttpHeaders();
    headers.setLocation(new URI("localhost:8080/" + 100));

    return new ResponseEntity<String>("Hello, WOrld", headers, HttpStatus.CREATED);
  }

  @ResponseStatus(HttpStatus.NO_CONTENT)
  @PutMapping("/{employee-id}")
  public void updateEmployee(@PathVariable("employee-id") Long id){

  }

  @ResponseStatus(HttpStatus.NO_CONTENT)
  @PatchMapping("/{employee-id}")
  public void patchEmployee(@PathVariable("employee-id") Long id){

  }

  @ResponseStatus(HttpStatus.NO_CONTENT)
  @PatchMapping("/{employee-id}")
  public void removeEmployee(@PathVariable("employee-id") Long id){

  }

}