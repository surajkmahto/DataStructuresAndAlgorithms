package com.tests;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.*;

public class SocieteGeneraleFastInput {
    public static void main(String[] args) throws IOException {
        Scan scan = new Scan();
        Print print = new Print();
        int t,n,m,query;
        t=scan.scanInt();
        while(t-- > 0){
            Set<Integer> finalSet = new TreeSet<>();
            Set<Integer> setA = new HashSet<>();
            Set<Integer> setB = new HashSet<>();
            n = scan.scanInt();
            m = scan.scanInt();
            while(n-- > 0){
                int temp = scan.scanInt();
                setA.add(temp);
            }
            while(m-- > 0){
                int temp = scan.scanInt();
                setB.add(temp);
            }
            query=scan.scanInt();
            switch (query){
                case 1:
                    finalSet.addAll(setA);
                    finalSet.retainAll(setB);
                    break;

                case 2:
                    finalSet.addAll(setA);
                    finalSet.addAll(setB);
                    break;

                case 3:
                    finalSet.addAll(setA);
                    finalSet.addAll(setB);
                    setA.retainAll(setB);
                    finalSet.removeAll(setA);
                    break;

                case 4:
                    finalSet.addAll(setA);
                    finalSet.removeAll(setB);
                    break;

                case 5:
                    finalSet.addAll(setB);
                    finalSet.removeAll(setA);
                    break;

                default:
                    break;
            }
            String ans= finalSet.toString();
            ans = ans.substring(1,ans.length()-1);
            String finalAns = "{" + ans + "}";
            print.println(finalAns);
        }
        print.close();
    }
}

class Scan
{
    private byte[] buf=new byte[1024];
    private int index;
    private InputStream in;
    private int total;
    public Scan()
    {
        in=System.in;
    }
    public int scan()throws IOException
    {
        if(total<0)
            throw new InputMismatchException();
        if(index>=total)
        {
            index=0;
            total=in.read(buf);
            if(total<=0)
                return -1;
        }
        return buf[index++];
    }
    public int scanInt()throws IOException
    {
        int integer=0;
        int n=scan();
        while(isWhiteSpace(n))
            n=scan();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=scan();
        }
        while(!isWhiteSpace(n))
        {
            if(n>='0'&&n<='9')
            {
                integer*=10;
                integer+=n-'0';
                n=scan();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
            return true;
        return false;
    }
}

class Print
{
    private final BufferedWriter bw;
    public Print()
    {
        this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
    }
    public void print(Object object)throws IOException
    {
        bw.append(""+object);
    }
    public void println(Object object)throws IOException
    {
        print(object);
        bw.append("\n");
    }
    public void close()throws IOException
    {
        bw.close();
    }
}
