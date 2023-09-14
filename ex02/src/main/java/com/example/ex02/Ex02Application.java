package com.example.ex02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import db.DBConnectionMgr;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class Ex02Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Ex02Application.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		//select ename from emp     scott/tiger 
		DBConnectionMgr pool=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		// sql구문
		try {
			pool=DBConnectionMgr.getInstance();
			con = pool.getConnection();
			System.out.println("con->" + con);
			String sql = "select ename from emp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ename"));
			}
		} catch (Exception e) {
			System.out.println("실행에러유발" + e);
		} finally {//메모리 해제
			pool.freeConnection(con, pstmt, rs);
		}
	}

}
