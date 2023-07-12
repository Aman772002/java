public class EnvironmentVariablesExample {
    public static void main(String[] args) {
        String path = System.getenv("PATH");
        String classpath = System.getenv("CLASSPATH");

        System.out.println("PATH: " + path);
        System.out.println("CLASSPATH: " + classpath);
    }
}
