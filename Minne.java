package sample;


import javafx.beans.property.SimpleStringProperty;

public class Minne {

    private SimpleStringProperty produsenter;
    private SimpleStringProperty kapasitet;
    private SimpleStringProperty hastighet;
    private double pris;



    public void setProdusenter(SimpleStringProperty navn) throws Unntakk {
        String re= "(((C|c)rosair)|(C(C|c)rucial)|((D|d)ell)|((H|h)yperX))"; //lovelig input
        if ((navn.get()).isEmpty()){
            throw new Unntakk("Vennligst, fyll produsenters navn!");
        }

        else if(!(navn.get()).matches(re)){
            throw new Unntakk("Ugyldig navn!");
        }
        this.produsenter = navn;

    }


    public void setKapasitet(SimpleStringProperty kapasitet) throws Unntakk{
        String re= "((8)|(16)|(32))"; //lovelig input
        if ( (kapasitet.get()).isEmpty()){
            throw new Unntakk("Vennligst, fyll kapasitet!");
        }

        else if(!(kapasitet.get()).matches(re)){
            throw new Unntakk("Ugyldig kapasitet!");
        }
        this.kapasitet = kapasitet;

    }

    public void setHastighet(SimpleStringProperty hastighet) throws Unntakk{
        String re= "((1600)|(2400)|(3200))"; //lovelig input
        if ((hastighet.get()).isEmpty()){
            throw new Unntakk("Vennligst, fyll hastighet!");
        }

        else if(!(hastighet.get()).matches(re)){
            throw new Unntakk("Ugyldig hastighet!");
        }
        this.hastighet = hastighet;

    }

    public void setPris(String pris) throws Unntakk  {
        if (pris.isEmpty()){
            throw new Unntakk("Vennligst, fyll pris!");
        }
        //Hvis brukeren ikke  taste inn helttall, for eks bokstaver får en feilmelding
        if(true){
            try {
                Double p = Double.parseDouble(pris);
            } catch (Exception e){
                throw new Unntakk(" Pris må være tall!");
            }
        }

        Double p = Double.parseDouble(pris); //konvertere parametret til double slik at vi kan gjøre opperasjoner på
        if ( p <500 || p>2000){
            throw new Unntakk("Ugyldig pris!");
        }
        this.pris = p;

    }

    public String getProdusenter() {
        return produsenter.get();
    }

    public String getHastighet() {
        return hastighet.get();
    }

    public String getKapasitet() {
        return kapasitet.get();
    }

    public double getPris() {
        return pris;
    }

    @Override
    public String toString() {

        String all_spes= "navn: "+ produsenter+",  hastighet: "+ hastighet+ ",  kapasitet: "+ kapasitet + ",  pris: "+ pris;

        return all_spes;
    }

}
