package main;

import lib.TextToAADLLexer;
import lib.TextToAADLParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        try {

            String inputFile = readInputFile("./src/data/CoffeeMaker1.txt");
            String input = cleanText(inputFile);
//            System.out.println(input);
            ANTLRInputStream inputStream = new ANTLRInputStream(input);
            TextToAADLLexer textToAADLLexer = new TextToAADLLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(textToAADLLexer);
            TextToAADLParser parser = new TextToAADLParser(tokens);
            Visitor visitor = new Visitor();
            visitor.visit(parser.nlparch());
//            for(int i=0;i<=visitor.index-1;i++){
//                System.out.println(visitor.system_declaration[i][0]);
//                System.out.println(visitor.system_declaration[i][1]);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String readInputFile(String path) throws FileNotFoundException {
        File NLP_Output = new File(path);
        Scanner sc = new Scanner(NLP_Output);
        String text = "";
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            text += s+"\n";
            }
        return text;
    }
    public static String cleanText(String s){
        return s;
    }
}
