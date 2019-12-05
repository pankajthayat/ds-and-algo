package problems;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {

	Demo demo = new Demo(1);
	Demo d2 = new Demo(2);
	Demo d3 = new Demo(3);
	
	Demo d4 =d2;
	
	List<Demo> l = new ArrayList<Demo>();
	l.add(demo);
	l.add(d2);
	l.add(d3);
	l.add(null);
	l.add(null);
	l.add(null);
	
	
	System.out.println(" pankaj : "+l.contains(null));
	
}



static int demo(String s) {
	int c=0; String str="";
    
    for(int i=0;i<s.length();i++){
    	 System.out.println("str : " +str);
       char alpha = s.charAt(i);
        if(str.indexOf(alpha)>=0){
            if(str.length()> c)
                 c=str.length();   
            str=str.substring(str.indexOf(alpha)+1)+alpha+"";
           
        } else{
            str=str+alpha;
        }
    }
    if(str.length()>c)
        return str.length();
    return c;
}
}


class Demo{
	int age;
	public Demo(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
	}
}