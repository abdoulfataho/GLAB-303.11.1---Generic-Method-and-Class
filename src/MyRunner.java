public class MyRunner {
    public static void main(String[] args) {
        // initialize generic class
        // with String and Integer data

        GMultipleDtatype<String, Integer> mobj = new GMultipleDtatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GMultipleDtatype<String, String> mobj2 = new GMultipleDtatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }

}
