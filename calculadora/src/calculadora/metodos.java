/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class metodos {
// binario -> dec, hex oct

    public static String BinarioADecimal(String DAB) {
        try {
            int dec = Integer.parseInt(DAB, 2);
            DAB = Integer.toString(dec);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        return DAB;
    }

    public static String BinarioAHexadecimal(String valor) {
        try {
            int dec = Integer.parseInt(valor, 2);
            valor = Integer.toHexString(dec);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error hex");
        }

        return valor;
    }

    public static String BinarioAOctal(String valor) {
        try {
            int dec = Integer.parseInt(valor, 2);
            valor = Integer.toOctalString(dec);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error oct");
        }

        return valor;
    }
// binario -> dec, hex oct

// decimal -> bin, hex oct
    public static String DecimalABinario(String DAB) {
        try {
            int dec = Integer.parseInt(DAB);
            DAB = Integer.toBinaryString(dec);
        } catch (Exception e) {
        }

        return DAB;
    }

    public static String DecimalAHexadecimal(String DAH) {
        try {
            int dec = Integer.parseInt(DAH);
            DAH = Integer.toHexString(dec);
        } catch (Exception e) {
        }

        return DAH;
    }

    public static String DecimalAOctal(String DAO) {
        try {
            int dec = Integer.parseInt(DAO);
            DAO = Integer.toOctalString(dec);
        } catch (Exception e) {
        }

        return DAO;
    }
// decimal -> bin, hex oct

//hexadecimal -> bin , oct
    public static String HexaADec(String HAD) {
        try {
            int dec = Integer.parseInt(HAD, 16);
            HAD = Integer.toString(dec);
        } catch (Exception e) {
        }

        return HAD;
    }

    public static String HexaABinario(String HAB) {
        try {
            long dec = Integer.parseInt(HAB, 16);
            HAB = Long.toBinaryString(dec);
        } catch (Exception e) {
        }

        return HAB;
    }

    public static String HezaAOctal(String HAO) {
        try {
            int dec = Integer.parseInt(HAO, 16);
            HAO = Integer.toOctalString(dec);
        } catch (Exception e) {
        }

        return HAO;
    }

//hexadecimal -> bin , oct
// ctal -> bin, hexa, dec
    public static String OctalADecimal(String OAD) {
        try {
            int dec = Integer.parseInt(OAD, 8);
            OAD = Integer.toString(dec);
        } catch (Exception e) {
        }

        return OAD;
    }

    public static String OctalABinario(String OAB) {
        try {
            int dec = Integer.parseInt(OAB, 8);
            OAB = Integer.toBinaryString(dec);
        } catch (Exception e) {
        }

        return OAB;
    }

    public static String OctalAHexa(String OAH) {
        try {
            int dec = Integer.parseInt(OAH, 8);
            OAH = Integer.toHexString(dec);

        } catch (Exception e) {
        }

        return OAH;
    }

// octal -> bin , hexa, dec
}
