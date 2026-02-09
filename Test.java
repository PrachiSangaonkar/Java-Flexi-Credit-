class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        obj = null; // Set obj to null
        System.gc(); // Suggest the JVM to run garbage collection
    }

}
