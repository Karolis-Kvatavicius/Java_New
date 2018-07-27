package builderpattern;

//ND 07.26
//
//        Sukurti Builder tipo klase, kuri pagal nustatytus parametrus (7 laukai skaiciams) grazintu loterijos bilietu laimingu numeriu aibe (kaip pavyzdi, galite naudoti Tele Loto zaidimo biietus kaip pavyzdi).
//        T.y. builderyje turime setinti kiekviena skaiciu atskirai.
//        Jei norime, kad skaicius butu bet koks setiname -1. Po metodo build() iskvietimo toks skaicius turi buti pakeistas zvaigzdute.
//        Taip pat turime nurodyti didziausia galima bilieto reiksme (long tipo laukelis).
//        Build metodas turi grazinti nr (pvz.: 00158*0). Visi -1 skaiciai turi buti pakeisti zvaigzdutemis. Jeigu skaicius nepatenka i diapozona, tai turi likti nulis.

class NumberBuilder {

    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int n6;
    private int n7;

//    private static final long MAX = 9999999;


    Number build(){
        this.setN1().setN2().setN3().setN4().setN5().setN6().setN7();
        return new Number(this);
    }

    private NumberBuilder setN1() {
        this.n1 = (int) (Math.random()*10);
        return this;
    }

    private NumberBuilder setN2() {
        this.n2 = (int) (Math.random()*10);
        return this;
    }

    private NumberBuilder setN3() {
        this.n3 = (int) (Math.random()*10);
        return this;
    }

    private NumberBuilder setN4() {
        this.n4 = (int) (Math.random()*10);
        return this;
    }

    private NumberBuilder setN5() {
        this.n5 = (int) (Math.random()*10);
        return this;
    }

    private NumberBuilder setN6() {
        this.n6 = (int) (Math.random()*10);
        return this;
    }

    private NumberBuilder setN7() {
        this.n7 = (int) (Math.random()*10);
        return this;
    }

    int getN1() {
        return n1;
    }

    int getN2() {
        return n2;
    }

    int getN3() {
        return n3;
    }

    int getN4() {
        return n4;
    }

    int getN5() {
        return n5;
    }

    int getN6() {
        return n6;
    }

    int getN7() {
        return n7;
    }

//    public static long getMAX() {
//        return MAX;
//    }
}
