public class Laba3 {

    public static void main(String[] args) {

    }
}

class officeEquipment{
    String lastName,
            firstName,
            middleName;

    int age;

    public officeEquipment(String lastName, String firstName, String middleName){

    }

    void getFullName(){

    }
}


class Printer extends officeEquipment {

}

class Skaner extends officeEquipment {

    public Skaner(String lastName, String firstName, String middleName) {
        super(lastName, firstName, middleName);
    }
}
