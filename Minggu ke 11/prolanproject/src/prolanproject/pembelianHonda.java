/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolanproject;

/**
 *
 * @author DEA21
 */
public class pembelianHonda extends pembelian implements motor {

    

    @Override
    public double hitungTotal() {
        double pembelian = harga * jumlah;
        return pembelian;
    }

    

    
    
}
