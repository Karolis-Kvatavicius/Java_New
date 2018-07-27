package builderpattern;

class Number {

    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int n6;
    private int n7;

    Number(NumberBuilder builder){

        this.n1 = builder.getN1();
        this.n2 = builder.getN2();
        this.n3 = builder.getN3();
        this.n4 = builder.getN4();
        this.n5 = builder.getN5();
        this.n6 = builder.getN6();
        this.n7 = builder.getN7();
    }

    void luckyTicketForPrize() {
        System.out.print(this.n1 + " ");
        System.out.print(this.n2 + " ");
        System.out.print(this.n3 + " ");
        System.out.print(this.n4 + " ");
        System.out.print(this.n5 + " ");
        System.out.print(String.valueOf( this.n6 ).replaceAll( "\\d", "* " ));
        System.out.print(this.n7 + " \n");
    }


}
