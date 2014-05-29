package org.dynastymasra.tot.inter;

/**
 * Author   : Dynastymasra
 * Name     : Dimas Ragil T
 * Email    : dynastymasra@gmail.com
 * LinkedIn : http://www.linkedin.com/in/dynastymasra
 * Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
 */
public class MahasiswaStrata implements Srtata {
    private String nim;
    private String univ;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    @Override
    public String getNim() {
        return nim;
    }

    @Override
    public String getNama() {
        return univ;
    }
}
