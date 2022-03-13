/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author M&G
 */
public class CodeGenerate {

    int states;
    int alphabetsCount;
    String[] alphapets;
    String[][] data;
    String[] accepts;

    public CodeGenerate(int states, int alphabetsCount, String[] alphapets, String[][] data, String[] accepts) {
        this.states = states;
        this.alphabetsCount = alphabetsCount;
        this.alphapets = alphapets;
        this.data = data;
        this.accepts = accepts;
    }

    private String addElse(int j) {
        if (j == 0) {
            return "";
        } else {
            return "else ";
        }
    }

    public String generate() {
        String code = "";
        code = code + "public class Recognizer \n";
        code = code + "{ \n";

        code = code + "public static boolean belangs(String token) \n";
        code = code + "{ \n";
        code = code + "int state = 1;\n int i = 0;\n";
        code = code + "while (i<token.length())\n";
        code = code + "{ \n";
        code = code + "char ch = token.getCharAt(i);\n";
        
        code = code + "switch(state)\n";
        code = code + "{ \n";
        for (int i = 0; i < data.length; i++) {
            code = code + "case " + (i + 1) + ":\n";
            for (int j = 0; j < alphapets.length - 1; j++) {
                code = code + addElse(j) + " if(ch == " + alphapets[j + 1] + ") state = " + data[i][j + 1] + ";\n";
            }
            code = code + "else return false;\nbreak;\n";

        }

        code = code + "} \n";
        code = code + "i = i +1;\n";
        code = code + "} \n";
        code= code + "if (state =="+states+")\n";
        code = code + "return true;\n";
        if(accepts.length !=0){
        for(int i = 0;i<accepts.length;i++){
        code = code + "else if(state =="+accepts[i]+")\n return true;\n";
        }
        }
        code = code + "else \n";
        code = code + "return false;\n";
        code = code + "} \n";
                code = code + "} \n";


        System.out.println(code);
        return code;
    }
}
