package com.mystudy.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Exam {

	public static void main(String[] args) throws MalformedURLException {
		// 프로토콜://호스트(서버):포트번호 /경로(패스)  					?질의(query)
		// https://n.news.naver.com/mnews/article/001/0014109231?rc=N&ntype=RANKING
		
		URL url = new URL("http", "mystudy.com", 8080, 
				"/aaa/bbb/index.jsp?id=hong&password=1234#content");
		System.out.println("url : " + url);
		//http://mystudy.com:8080//aaa/bbb/index.jsp?id=hong&password=1234#content

		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
				
		System.out.println("프로토콜(protocol) : " + protocol);
		// http
		System.out.println("호스트(host) : " + host);
		// mystudy.com
		System.out.println("포트번호(port) : " + port);
		// 8080
		System.out.println("기본포트(defaultPort) : " + defaultPort);
		// 80
		System.out.println("경로-패스(path) : " + path);
		// /aaa/bbb/index.jsp
		System.out.println("쿼리-질문(query) : " + query);
		// id=hong&password=1234
		System.out.println("참조(reference) : " + ref);
		// content
		
		System.out.println("-------------------------");
		url = new URL("https://n.news.naver.com/mnews/article/001/0014109231?rc=N&ntype=RANKING");
		System.out.println("url : " + url);
		
		protocol = url.getProtocol();
		host = url.getHost();
		port = url.getPort();
		defaultPort = url.getDefaultPort();
		path = url.getPath();
		query = url.getQuery();
		ref = url.getRef();
				
		System.out.println("프로토콜(protocol) : " + protocol);
		// https
		System.out.println("호스트(host) : " + host);
		// n.news.naver.com
		System.out.println("포트번호(port) : " + port);
		// -1 == 없다
		System.out.println("기본포트(defaultPort) : " + defaultPort);
		// 443 포트번호 없으면 기본포트 사용
		System.out.println("경로-패스(path) : " + path);
		// /mnews/article/001/0014109231
		System.out.println("쿼리-질문(query) : " + query);
		// rc=N&ntype=RANKING
		System.out.println("참조(reference) : " + ref);
		// null
	}

}
