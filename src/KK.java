/**
 * Created by Administrator on 2017/3/29 0029.
 */
import java.lang.*;
import java.util.Scanner;
public class KK {
    static double t=0;
    static double to=0;
    public static void main(String args[]){
        int aa=3;
        while(aa>1) {
            int x = 1 + (int) (Math.random() * 8);
            switch (x) {
                case 1:
                    jia();
                    System.out.println("正确率为" + t * 100 / to + "%");
                    break;
                case 2:
                    jian();
                    System.out.println("正确率为" + t * 100 / to + "%");
                    break;
                case 3:
                    cheng();
                    System.out.println("正确率为" + t * 100 / to + "%");
                    break;
                case 4:
                    chu();
                    System.out.println("正确率为" + t * 100 / to + "%");
                    break;
                case 5:
                    zjia();
                    System.out.println("正确率为"+t*100/to+"%");
                    break;
                case 6:
                    zjian();
                    System.out.println("正确率为"+t*100/to+"%");
                    break;
                case 7:
                    zcheng();
                    System.out.println("正确率为"+t*100/to+"%");
                    break;
                case 8:
                    zchu();
                    System.out.println("正确率为"+t*100/to+"%");
                    break;
            }
        }
    }
    public static void jia(){
        to++;
        int x=(int)(Math.random()*100);
        int y=(int)(Math.random()*100);
        int r=x+y;
        System.out.println(x+"+"+y+"=");
        Scanner in=new Scanner(System.in);
        int z=in.nextInt();
        if(z==r){
            System.out.println("正确");
            t++;
        }
        else{
            System.out.println("错误");
        }
    }
    public static void jian(){
        to++;
        int x=(int)(Math.random()*100);
        int y=(int)(Math.random()*100);
        int r=x-y;
        System.out.println(x+"-"+y+"=");
        Scanner in=new Scanner(System.in);
        int z=in.nextInt();
        if(z==r){
            System.out.println("正确");
            t++;
        }
        else{
            System.out.println("错误");
        }
    }
    public static void cheng(){
        to++;
        int x=(int)(Math.random()*100);
        int y=(int)(Math.random()*100);
        int r=x*y;
        System.out.println(x+"*"+y+"=");
        Scanner in=new Scanner(System.in);
        int z=in.nextInt();
        if(z==r){
            System.out.println("正确");
            t++;
        }
        else{
            System.out.println("错误");
        }
    }
    public static void chu(){
        to++;
        int x=(int)(Math.random()*100);
        int y=1+(int)(Math.random()*99);
        System.out.println(x+"÷"+y+"=");
        int r1=0;
        String r2="";
        String r3="";

        r1=x/y;
        r2=String.valueOf(1.0*x/y);
        r3=check(x,y);
        String result;
        Scanner in =new Scanner(System.in);
        result = in.next();
        if(result.indexOf('/')!=-1){
            if(result.equals(r3)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else if(result.indexOf('.')!=-1){
            if(result.equals(r2)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else{
            if(r1==Integer.parseInt(result)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
    }
    public static void zjia(){
        to++;
        int a=(int)(Math.random()*100);
        int b=1+(int)(Math.random()*100);
        int c=(int)(Math.random()*100);
        int d=1+(int)(Math.random()*100);
        if(a==b)
            b+=1;
        if(c==d)
            d+=1;
        int fz1=a*d;
        int fz2=c*b;
        int fz=fz1+fz2;
        int fm=b*d;
        String r1="";
        String r2="";
        int r3=0;

        r3=fz/fm;
        r1=String.valueOf(1.0*fz/fm);
        r2=check(fz,fm);

        System.out.println(a+"/"+b+"+"+c+"/"+d+"=");
        Scanner in=new Scanner(System.in);
        String result = in.next();

        if(result.indexOf('/')!=-1){
            if(result.equals(r2)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else if(result.indexOf('.')!=-1){
            if(result.equals(r1)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else{
            if(r3==Integer.parseInt(result)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
    }
    public static void zjian(){
        to++;
        int a=(int)(Math.random()*100);
        int b=1+(int)(Math.random()*100);
        int c=(int)(Math.random()*100);
        int d=1+(int)(Math.random()*100);
        if(a==b)
            b+=1;
        if(c==d)
            d+=1;
        int fz1=a*d;
        int fz2=c*b;
        int fz=fz1-fz2;
        int fm=b*d;
        String r1="";
        String r2="";
        int r3=0;

        r3=fz/fm;
        r1=String.valueOf(1.0*fz/fm);
        r2=check(fz,fm);

        System.out.println(a+"/"+b+"-"+c+"/"+d+"=");
        Scanner in=new Scanner(System.in);
        String result = in.next();

        if(result.indexOf('/')!=-1){
            if(result.equals(r2)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else if(result.indexOf('.')!=-1){
            if(result.equals(r1)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else{
            if(r3==Integer.parseInt(result)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
    }
    public static void zcheng(){
        to++;
        int a=(int)(Math.random()*100);
        int b=1+(int)(Math.random()*100);
        int c=(int)(Math.random()*100);
        int d=1+(int)(Math.random()*100);
        if(a==b)
            b+=1;
        if(c==d)
            d+=1;
        int fz=a*c;
        int fm=b*d;
        String r1="";
        String r2="";
        int r3=0;

        r3=fz/fm;
        r1=String.valueOf(1.0*fz/fm);
        r2=check(fz,fm);

        System.out.println(a+"/"+b+"×"+c+"/"+d+"=");
        Scanner in=new Scanner(System.in);
        String result = in.next();

        if(result.indexOf('/')!=-1){
            if(result.equals(r2)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else if(result.indexOf('.')!=-1){
            if(result.equals(r1)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else{
            if(r3==Integer.parseInt(result)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
    }
    public static void zchu(){
        to++;
        int a=(int)(Math.random()*100);
        int b=1+(int)(Math.random()*100);
        int c=(int)(Math.random()*100);
        int d=1+(int)(Math.random()*100);
        if(a==b)
            b+=1;
        if(c==d)
            d+=1;
        int fz=a*d;
        int fm=b*c;
        String r1="";
        String r2="";
        int r3=0;

        r3=fz/fm;
        r1=String.valueOf(1.0*fz/fm);
        r2=check(fz,fm);

        System.out.println(a+"/"+b+"÷"+c+"/"+d+"=");
        Scanner in=new Scanner(System.in);
        String result = in.next();

        if(result.indexOf('/')!=-1){
            if(result.equals(r2)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else if(result.indexOf('.')!=-1){
            if(result.equals(r1)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
        else{
            if(r3==Integer.parseInt(result)){
                System.out.println("正确");
                t++;
            }
            else{
                System.out.println("错误");
            }
        }
    }
    public static String check(int x,int y){
        for(int i=2;i<x&&i<y;i++){
            if(x%i==0&&y%i==0){
                x/=i;
                y/=i;
                i=2;
            }
        }
        return x+"/"+y;
    }
}
