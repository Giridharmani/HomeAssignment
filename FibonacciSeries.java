package hometask1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,n3,i,count=8;// if we change the count output will get differ 
System.out.println(n1+" "+n2);// from 0,1
for (i=2;i<count;++i)// starts from 2 becuase already 0,1 printed
{
	n3=n1+n2;
	System.out.println(" "+n3);
	n1=n2;
	n2=n3;
}

	}

}
