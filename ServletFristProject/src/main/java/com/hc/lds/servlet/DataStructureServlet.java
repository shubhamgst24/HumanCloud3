package com.hc.lds.servlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hc.lds.DataStructureStore;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DataStructureServlet extends HttpServlet  {

	// http://localhost:8080/ds?name=stack&operation=push&data=10
	static Scanner sc=new  Scanner(System.in);

	private ObjectMapper mapper = new ObjectMapper();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//		String ds = req.getParameter("name");
		//		String operation = req.getParameter("operation");
		String path=req.getPathInfo();
		System.out.println(path);
		String[] s1 = null;
		String s="";
		if(path != null && !path.isEmpty()) {
			s1=path.split("/");
			s= s1[1];
			System.out.println(s);
		}
		String s2=s1[2];
		switch (s) {


		case "stack":
		{
			switch (s2) {
			case "push":{
				System.out.println("push method called");
				System.out.println("Enter element ");
				String ss=s1[3];
				int t=Integer.parseInt(ss);
				DataStructureStore.getStack().push(t);
				resp.getWriter().append(mapper.writeValueAsString("Element added successfully...")).flush();

			}
			break;
			case "pop":
			{
				int t=DataStructureStore.getStack().pop();
				resp.getWriter().append(mapper.writeValueAsString("removed element: "+t)).flush();
			}
			break;
			case "print":
			{
				resp.getWriter().append(mapper.writeValueAsString(Arrays.toString(DataStructureStore.getStack().print()))).flush();
			}
			break;
			case "peek":
			{
				resp.getWriter().append(mapper.writeValueAsString("peek element : "+DataStructureStore.getStack().peek())).flush();	
			}break;
			case "size":
			{
				resp.getWriter().append(mapper.writeValueAsString("stack size is : "+DataStructureStore.getStack().size())).flush();
			}break;
			case "isEmpty":
			{
				resp.getWriter().append(mapper.writeValueAsString("stack is empty : "+DataStructureStore.getStack().isEmpty())).flush();
			}
			default:
				resp.getWriter().append(mapper.writeValueAsString("Something went wrong please check URL ")).flush();

				break;
			}
		}
		break;
		case "queue":
		{
			switch (s2) {
			case "enqueue":
			{
				String ss=s1[3];
				int t=Integer.parseInt(ss);
				DataStructureStore.getQueue().enqueue(t);
				resp.getWriter().append(mapper.writeValueAsString("Element added successfully...")).flush();
			}
			break;
			case "dequeue":
			{
				resp.getWriter().append(mapper.writeValueAsString("removed element: "+DataStructureStore.getQueue().dequeue())).flush();
			}
			break;
			case "display":
			{
				resp.getWriter().append(mapper.writeValueAsString("All Queue element : "+Arrays.toString(DataStructureStore.getQueue().display()))).flush();
			}
			break;
			case "peek":
			{
				resp.getWriter().append(mapper.writeValueAsString("peek element : "+DataStructureStore.getQueue().peek())).flush();
			}
			break;
			case "isEmpty":
			{
				resp.getWriter().append(mapper.writeValueAsString("queue is empty : "+DataStructureStore.getQueue().isEmpty())).flush();
			}	
			break;
			case "getSize":
			{
				resp.getWriter().append(mapper.writeValueAsString("queue size is : "+DataStructureStore.getQueue().getSize())).flush();
			}		
			break;

			default:
				resp.getWriter().append(mapper.writeValueAsString("Something went wrong please check URL ")).flush();
				break;
			}
		}
		break;
		case "linkedList":
		{
			switch (s2) {
			case "add":
			{
				DataStructureStore.getLinkedlist().add(Integer.parseInt(s1[3]));
				resp.getWriter().append(mapper.writeValueAsString("Element added successfully...")).flush();
			}break;
			case "toString":
			{
				resp.getWriter().append(mapper.writeValueAsString(DataStructureStore.getLinkedlist().toString()));
			}
			break;
			case "addAt":
			{
				resp.getWriter().append(mapper.writeValueAsString((DataStructureStore.getLinkedlist().addAt(Integer.parseInt(s1[3]), Integer.parseInt(s1[4]))?"Element added successfully":"Element not added")));
			}break;
			case "get":{
				resp.getWriter().append(mapper.writeValueAsString(DataStructureStore.getLinkedlist().get(Integer.parseInt(s1[3]))));
			}
			break;
			case "remove":{
				resp.getWriter().append(mapper.writeValueAsString("Element is "+(DataStructureStore.getLinkedlist().remove(Integer.parseInt(s1[3]))?"removed":"not removed")));
			}
			break;
			default:
				resp.getWriter().append(mapper.writeValueAsString("Something went wrong please check URL ")).flush();
				break;
			}
		}
		break;
		case "array":
		{
			switch (s2) {
			case "insertElements":
			{
				resp.getWriter().append(mapper.writeValueAsString(Arrays.toString(DataStructureStore.getArray().ensertElement(Integer.parseInt(s1[3])))));
			}
			break;
			case "get":
			{
				resp.getWriter().append(mapper.writeValueAsString(""+DataStructureStore.getArray().get(Integer.parseInt(s1[3]))));
			}
				break;
			case "length":
			{
				
				resp.getWriter().append(mapper.writeValueAsString("Array length is : "+DataStructureStore.getArray().length()));
			}
				break;
			case "remove":
			{
				resp.getWriter().append(mapper.writeValueAsString("element is "+(DataStructureStore.getArray().remove(Integer.parseInt(s1[3]))) != null?"removed":"not removed"));
			}
				break;
			case "sort":
			{
				resp.getWriter().append(mapper.writeValueAsString(Arrays.toString(DataStructureStore.getArray().sort())));
			}
				break;
			case "toString":
			{
				resp.getWriter().append(mapper.writeValueAsString(DataStructureStore.getArray().toString()));
			}break;
			default:
				resp.getWriter().append(mapper.writeValueAsString("Something went wrong please check URL ")).flush();
				break;
			}
		}
			break;
		default:
			resp.getWriter().append(mapper.writeValueAsString("Something went wrong please check URL ")).flush();
			break;
		}
	}

}
