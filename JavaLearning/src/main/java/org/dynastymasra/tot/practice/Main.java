package org.dynastymasra.tot.practice;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class Main {
    public static void main(String[] args) {
        Mahasiswa icha = new Mahasiswa("001", "Icha");
        Mahasiswa bayu = new Mahasiswa("002", "Bayu");
        Mahasiswa kateng = new Mahasiswa("003", "Kateng");
        Mahasiswa ardi = new Mahasiswa("004", "Ardi");

        MataKuliah pbo = new MataKuliah("MK001", "PBO");

        Nilai ichaPbo = new Nilai(icha, pbo, 80);
        Nilai bayuPbo = new Nilai(bayu, pbo, 80);
        Nilai katengPbo = new Nilai(kateng, pbo, 80);
        Nilai ardiPbo = new Nilai(ardi, pbo, 80);
    }
}
