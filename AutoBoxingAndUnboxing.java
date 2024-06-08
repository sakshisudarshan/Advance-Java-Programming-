package AutoBoxing;
public class AutoEx {


    public static void main(String[] args) {
        Integer i=125;
        Integer j=new Integer(125);
        // j is pointing to an object in heap and not the information in pool

        if(i==j)
            System.out.println("0 i==j"); // does not print

        i++; j++;
        // j++ makes j to point to the information in pool, since the information is < 127
        if(i== j)
            System.out.println("1 i==j");

        i++; j++;
        if(i== j)
            System.out.println("2 i==j");

        i++; j++; // i and j value moves over 127

        if(i==j)
            System.out.println("3 i==j"); // does not print
        System.out.println();
    }
}

