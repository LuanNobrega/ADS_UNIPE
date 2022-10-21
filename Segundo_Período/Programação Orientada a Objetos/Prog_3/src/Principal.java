public class Principal {
    public static void main(String[] args){

        Casa casa = new Casa();

        casa.porta1(casa.abrePorta());
        casa.porta2(casa.abrePorta());
        casa.porta3(casa.abrePorta());
        //casa.porta3(casa.fechaPorta());
        //casa.porta1(casa.fechaPorta());
        casa.pintarCasa("verde");
        casa.pintarCasa("azul");
        casa.pintarCasa("lilás");
        System.out.println(casa);

        casa.pintarCasa("cinza");
        casa.pintarCasa("branco");
        casa.pintarCasa("amarelo");


    }
    }

