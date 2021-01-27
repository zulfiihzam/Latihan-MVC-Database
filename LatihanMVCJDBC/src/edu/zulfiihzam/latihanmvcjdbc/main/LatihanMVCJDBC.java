/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.zulfiihzam.latihanmvcjdbc.main;

import edu.zulfiihzam.latihanmvcjdbc.database.BarbershopDatabase;
import edu.zulfiihzam.latihanmvcjdbc.entity.Pelanggan;
import edu.zulfiihzam.latihanmvcjdbc.error.PelangganException;
import edu.zulfiihzam.latihanmvcjdbc.service.PelangganDao;
import edu.zulfiihzam.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *  Nim     : 10117125
 *  Nama    : Zulfi ihzam Rahmat
 *  Kelas   : IF-1
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws edu.zulfiihzam.latihanmvcjdbc.error.PelangganException
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainViewPelanggan pelanggan = new MainViewPelanggan();
                try {
                    pelanggan.loadDatabase();
                } catch (SQLException ex) {
                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }
                pelanggan.setVisible(true);
            }
        });
}
}
