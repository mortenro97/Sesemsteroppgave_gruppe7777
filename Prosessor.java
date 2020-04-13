package sample;

public class Prosessor {

    String type;
    private int antall_core;
    private int antall_threads;
    private double pris;
    //int  fart;  GHz


    //setters
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
        if ( p <= 0){
            throw new Unntakk("Ugyldig pris!");
        }
        this.pris = p;

    }


    public void setType(String type)throws Unntakk  {

        ////type AMD (Rayzen/ Athlon)     /intel (Core i3/5/7/9)/Xeon

        String re= "(((I|i)ntel (Xeon|(C|c)ore i(3|5|7|9)))|(AMD (RYZEN|Athlon)))";
        if (type.isEmpty()){
            throw new Unntakk("Vennligst, fyll type!");
        }

        else if(!type.matches(re)){
            throw new Unntakk("Ugyldig format av type!");
        }
        this.type = type;

    }


    public void setAntallCore(String ant_core) throws Unntakk {
        //hvis brukeren glemmer å fylle feltet
        if (ant_core.isEmpty()){
            throw new Unntakk("Vennligst, fyll antall core!");
        }

        //Hvis brukeren ikke  taste inn helttall, for eks bokstaver
        if(true){
            try {
                int at = Integer.parseInt(ant_core); //konvertere til heltall
            } catch (Exception e){
                throw new Unntakk(" Antall core må være heltall!");
            }

        }

        int at = Integer.parseInt(ant_core); //konvertere parametret til heltall slik at vi kan gjøre opperasjoner på


        if(at <=1 || at>28 || at % 2 != 0){
            throw new Unntakk(" Antall core er ugyldig!");

        }
        this.antall_core=at;
        System.out.println(antall_core);
    }
    //[a-z]

    public void setAntallThreads(String ant_threads) throws Unntakk {
        //ikke lov at antall threads er færre enn antall core (men de kan være like)
        //best prosessoren er på 56 threads
        //antall threads bær parttall

        if (ant_threads.isEmpty()){
            throw new Unntakk("Vennligst, fyll antall threads!");
        }
        if(true){
            try {
                int at = Integer.parseInt(ant_threads);;
            } catch (Exception e){
                throw new Unntakk(" antall threads må være heltall!");
            }

        }
        //konvertere parametret til heltall slik at vi kan gjøre opperasjoner på
        int at = Integer.parseInt(ant_threads);


         if(at <=1 || at>56 || at % 2 != 0 || at < antall_core){
            throw new Unntakk(" Antall threads er ugyldig!");

        }
        this.antall_threads=at;
        System.out.println(antall_threads);
    }



    //getters

    public String getType() { return type; }

    public int getAntall_core() { return antall_core;}

    public int getAntall_threads() { return antall_threads; }

    public double getPris() { return pris; }


    @Override
    public String toString() {

        String all_spes= "type: "+ type+",  antall core: "+ antall_core+ ",  antall threads: "+ antall_threads + ",  pris: "+ pris;

        return all_spes;
    }

}
/*
ideer:
har slette:
redigering opprette en klasse   @Override

 */
