package allo;
import allo.B.*;
public class A{
    protected String etat;
    protected B objetB;
    public void A(){
        etat="initilise par A";
    }    
    public void travailpourAappelB(){
        objetB.tell();
    }
    public void travailpourAappelA(){
        System.out.println("AAAAAAAAAAlo");
    }
}