package Bronze;

public class chars_test {public static void main(String[] args) {
	String temp;
	int a = 1112000111;
	temp = Integer.toString(a);
	double dis = temp.chars().filter(ch -> ch == (char) '1').count();
	System.out.println(dis);
	System.out.println();
	System.out.println();
}

}
