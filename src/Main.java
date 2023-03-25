public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        int[] a=new int[]{18,19,20,25};
//        methood(a,"Aidai","Dilnaz","Alina","Dasha");
        String slova=" I like Java!!! ";
        System.out.println(slova.charAt(slova.length()-1));
        System.out.println(slova.endsWith("!!!"));
        System.out.println(slova.startsWith(" I like "));
        System.out.println(slova.contains("java"));
        System.out.println(slova.replace("a", "o"));
        System.out.println(slova.length());
        String ss=slova.substring(9,13);
        System.out.println(ss.toUpperCase());
        System.out.println(slova.toLowerCase());

        System.out.println(slova.trim());


    }
    static void methood(int[]a,String...names) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(names[i]+"  "+a[i]+"лет");
        }


