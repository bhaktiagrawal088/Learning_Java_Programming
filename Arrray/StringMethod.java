public class StringMethod {
    public static void main(String args[]) {
        String name = "     Bhakti";
        boolean result = name.equals("bhakti");
        boolean result1 = name.equalsIgnoreCase("bhakti");
        System.out.println(result);
        System.out.println(result1);

        int len = name.length();
        System.out.println(len);

        char c = name.charAt(0);
        System.out.println(c); // First character for name string

        int index = name.indexOf("B");
        System.out.println(index); // Return the Index of B in string of name

        boolean e = name.isEmpty();
        System.out.println(e); // Checking whether the string is empty or not

        String u = name.toUpperCase();
        System.out.println(u); // convert into upper case

        String l = name.toLowerCase();
        System.out.println(l); // Convert into Lower Case

        String t = name.trim();
        System.out.println(t); // Removing leading and trailing spaces from a given

        String rp = name.replace(name, "Agrawal");
        System.out.println(rp); // Replacing the original string with new string
    }

}
