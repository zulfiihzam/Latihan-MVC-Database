/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.zulfiihzam.latihanmvcjdbc.error;

/**
 *  Nim     : 10117125
 *  Nama    : Zulfi ihzam Rahmat
 *  Kelas   : IF-1
 */
public class PelangganException extends Exception {

    /**
     * Creates a new instance of <code>pelangganException</code> without detail
     * message.
     */
    public PelangganException() {
    }

    /**
     * Constructs an instance of <code>pelangganException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelangganException(String msg) {
        super(msg);
    }
}
