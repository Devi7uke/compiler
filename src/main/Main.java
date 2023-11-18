package main;
import java.io.*;
import lexer.*;
import parser.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Lexer lex = new Lexer();
        Parser parse = new Parser(lex);
        parse.program();
        System.out.println("\n");
    }
}
/*
Test 1
{
    int i;
    int j;
    float v;
    float x;
    float[100] a;
    a[j] = v * i;
    while(a[i] < v){
        i = i + 1;
        a[i] = a[j];
        a[j] = x;
    }
}

Test 2
{
    int i;
    int j;
    float v;
    float x;
    float[100] a;
    while(true){
        do i = i + 1; while(a[i] < v);
        do j = j - 1; while(a[j] > v);
        if(i >= j) break;
        x = a[i];
        a[i] = a[j];
        a[j] = x;
    }
}
*/