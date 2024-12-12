import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Analizador{



    public static void main(String[] args) throws Exception{

        String outputFile = "Arbol.html"; // Archivo de salida para el AST
        String outputFile2 = "MiniB.j"; // Archivo de salida para Jasmin
        String inputFile=null;
        if(args.length>0) inputFile=args[0];

        InputStream is =System.in;
        if(inputFile!=null) is =new FileInputStream(inputFile);
    
        ANTLRInputStream input =new ANTLRInputStream(is);

        miniBLexer lexer = new miniBLexer(input);

        CommonTokenStream tokens =new CommonTokenStream(lexer);

        miniBParser parser = new miniBParser(tokens);

        ParseTree tree = parser.programa();
        
        AnalizadorVisitor visitante = new AnalizadorVisitor();
        //visitante.visit(tree);

        String jasminCode = createJasminFile(visitante.visit(tree));

        try (FileWriter writer = new FileWriter(outputFile2)) {
            writer.write(jasminCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String createJasminFile(String instructions) {
        return ".class public MiniB\n"
                + ".super java/lang/Object\n"
                + "\n"
                + ".method public static main([Ljava/lang/String;)V\n"
                + "   .limit stack 100\n"
                + "   .limit locals 100\n"
                + "\n"
                + instructions + "\n"
                + "return\n"
                + "\n"
                + ".end method";
    }
}