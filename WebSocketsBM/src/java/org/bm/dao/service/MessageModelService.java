/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bm.dao.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import bm.java.ws.model.MesaggeModel;

/**
 *
 * @author Evelyn
 */
public class MessageModelService extends Conexion<MesaggeModel>
{
    
     public List<MesaggeModel> getMensahModelsList() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        MesaggeModel message = null;
         
         return null;
     }
    
}
