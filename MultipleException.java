public class MultipleException {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception occurred: " + e.getMessage());
        }
        System.out.println("Program continues after handling exceptions.");
    }

}
