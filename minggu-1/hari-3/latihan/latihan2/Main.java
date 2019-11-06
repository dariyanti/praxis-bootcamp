class Main {
    public static void main(String[] args) {
        TestGenerics<Integer> iObj = new TestGenerics<Integer>(15);
        System.out.println(iObj.getObject());

        TestGenerics<String> sObj = new TestGenerics<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}