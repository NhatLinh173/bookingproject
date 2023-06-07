/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.UserDTO;

/**
 *
 * @author linh2
 */
public class UserDAO {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    
    public List<UserDTO> getAllUser(){
        List<UserDTO> list = new ArrayList<>();
        String query ="select * from [user]";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new UserDTO(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getInt(8)));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
        return list;
    }
}
