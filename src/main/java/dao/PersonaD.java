package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Persona;

/**
 *
 * @author ctmar
 */
public class PersonaD extends Conexion {

    public void add(Persona persona) {
        this.conectar();
        try {
            String sql = "insert into persona(NOMBRE,APELLIDO_PARTENO,APELLIDO_MATERNO,DNI) values(?,?,?,?)";
            PreparedStatement ps = this.getCn().prepareStatement(sql);
            ps.setString(1, persona.getNOMBRE());
            ps.setString(2, persona.getAPELLIDOP());
            ps.setString(3, persona.getAPELLIDOM());
            ps.setInt(4, persona.getDNI());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }

}
