import java.util.*;

class OrgTehno{
    int nambeSkan;
    int nambePrint;
    public String Print[];
    public void display(){
        String Print[] = {
           "HP Printer T-300"
        };
    }
}

class Skanget extends OrgTehno {

//    String Skan[] = {
//            "HD Skanget P-2000",
//            "HP G-100",
//            "GD-2200",
//    };
}

class Printer extends OrgTehno {
    @Override
    public void display(){
        System.out.println(Print[0]);
    }
}

public class main {


    public static void main(String[] args) {
        OrgTehno objOrgTehno = new OrgTehno();
        objOrgTehno.display();

//        OrgTehno objOrgTehno = new OrgTehno();
////        Skanget objSkanget = new Skanget();
//        Printer objPrinter = new Printer();
//
//        OrgTehno Offce;
//
//        Offce = objOrgTehno;
//        if(Offce instanceof OrgTehno){
//            System.out.println("Offce inherits ---> OrgTehno");}
//        else {System.out.println("Offce inherits -x-> OrgTehno");}
//
//        Offce = objSkanget;
//        if(Offce instanceof Skanget){
//            System.out.println("Offce inherits ---> Skanget");}
//        else {System.out.println("Offce inherits -x-> Skanget");}
//
//        Offce = objPrinter;
//        if(Offce instanceof Printer){
//            System.out.println("Offce inherits ---> Printer");}
//        else {System.out.println("Offce inherits -x-> Printer");}


    }
}
