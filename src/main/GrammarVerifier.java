package main;

import lib.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;

public class GrammarVerifier {
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args){
        try {
            File NLPArchFile = new File("./src/data/CoffeeMaker1.txt");
            FileInputStream is = new FileInputStream(NLPArchFile);
            TextToAADLLexer textToAADLLexer = new TextToAADLLexer(CharStreams.fromStream(is));
            CommonTokenStream tokens = new CommonTokenStream(textToAADLLexer);
            TextToAADLParser textToAADLParser = new TextToAADLParser(tokens);
            textToAADLParser.removeErrorListeners();
            textToAADLParser.nlparch();
            Visitor visitor=new Visitor();
            ParseTree tree = textToAADLParser.nlparch();
            ParseTreeWalker walker = new ParseTreeWalker();
            System.out.println(visitor.visit(tree));
            TextToAADLBaseListener listener = new TextToAADLBaseListener();
            walker.walk(listener, tree);
        } catch(Exception e){
            e.printStackTrace();
        }
    }


}
