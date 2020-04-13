

package sample;

public class PC {
    Prosessor  prosessor;

    int skjermkort;
    int minne;
    int harddisk;
    String tastatur;
    String mus;
    String skjerm;

    public void setHarddisk(int harddisk) {
        /*
        minst hd - større en 1000
        //Core i7-8700T, 16GB RAM, 512GB SSD, Windows 10 Pro

         */

        this.harddisk = harddisk;
    }

    public void setMinne(int minne) {
        /*
        gyldig valg= 2 4  8  12  16 32
         */
        this.minne = minne;
    }

    public void setSkjerm(String skjerm) {
        this.skjerm = skjerm;
    }

    public void setSkjermkort(int skjermkort) {

        this.skjermkort = skjermkort;
    }

    public void setTastatur(String tastatur) {
        this.tastatur = tastatur;
    }

    public void setMus(String mus) {
        this.mus = mus;
    }

    public void setProsessor(Prosessor prosessor) {
        this.prosessor = prosessor;
    }

    public int getHarddisk() {
        return harddisk;
    }

    public int getMinne() {
        return minne;
    }

    public Prosessor getProsessor() {
        return prosessor;
    }

    public int getSkjermkort() {
        return skjermkort;
    }

    public String getMus() {
        return mus;
    }

    public String getSkjerm() {
        return skjerm;
    }

    public String getTastatur() {
        return tastatur;
    }

}
