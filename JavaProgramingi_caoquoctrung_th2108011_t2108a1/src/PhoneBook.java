import java.util.ArrayList;

public class PhoneBook extends Phone {

   ArrayList<String> phonelist=new ArrayList<>();

    @Override
    void insert(String name, String number) {
        boolean find=false;
        for (String s:phonelist) {
            if (s.contains(name)){
                find=true;
                if (!s.contains(number)){
                    s+=" : "+number;
                }else {
                    System.out.println("contacts are availidable");
                }
            }
        }
        if (!find){
            phonelist.add(name+":"+number);
        }
    }

    @Override
    void lookUp(String search) {
        boolean searched=false;
        for (String s:phonelist){
            if (s.contains(search)){
                searched=true;
                System.out.println(s.toString());
                break;
            }
        }
        if (!searched) {
            System.out.println("Not found username");
        }
    }

    @Override
    void delete(String name) {
        boolean searched=false;
        for (String s:phonelist){
            if (name.equals(s.substring(0,s.indexOf(",")))){
                searched=true;
                phonelist.remove(s);
                System.out.println("Deleted");
                break;
            }
        }
        if (!searched){
            System.out.println("Not found username:"+name);
        }
    }


}
