import java.io.*;
import java.nio.charset.StandardCharsets;

class ScriptPython {
    Process process;

    public void runScript(){
//        try{
//            process = Runtime.getRuntime().exec("python main.py");
//            mProcess = process;
//        }catch(Exception e) {
//            System.out.println("Exception Raised" + e.toString());
//        }
//        InputStream stdout = mProcess.getInputStream();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout,StandardCharsets.UTF_8));
//        String line;
//        try{
//            while((line = reader.readLine()) != null){
//                System.out.println("stdout: "+ line);
//            }
//        }catch(IOException e){
//            System.out.println("Exception in reading output"+ e.toString());
//        }


        String pythonLibLocationPath = "C:/Users/REVE/AppData/Local/Programs/Python/Python39/lib/site-packages";
        String command = "python " + "main.py ";
        try {
            Runtime runtime = Runtime.getRuntime();
            process = runtime.exec(command);
        }catch(Exception e) {
            System.out.println("Exception Raised" + e.toString());
        }

        InputStream stdout = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout,StandardCharsets.UTF_8));
        String line;
        try{
            while((line = reader.readLine()) != null){
                System.out.println("stdout: "+ line);
            }
        }catch(IOException e){
            System.out.println("Exception in reading output"+ e.toString());
        }
    }
}

class Solution {
    public static void main(String[] args){
        try {
            ProcessBuilder builder = new ProcessBuilder("python","E:\\others\\Java-leetcode\\Java-leetcode\\src\\main.py");
            Process process = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader readers = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String lines = null;
            while ((lines= reader.readLine())!=null){
                System.out.println("lines " + lines);
            }

            while ((lines= readers.readLine())!=null){
                System.out.println("Error lines " + lines);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}