/**
 * 
 */
package george;

/**
 * Kadapawo George William
 * 2021/A/KCS/1733/G/F
 */
class Year {
	  private int year;
	  public int getA() {
	    return year;
	  }
	  public void setA(int year) {
	    this.year = year;
	  }
	}

	class Main extends Year {
	  public static void main(String[] args) {
	    Year p1 = new Year();
	    p1.setA(2022);
	    System.out.println("\nYear of Entry " + p1.getA());
	    Scanner input = new Scanner(System.in);
	    System.out.println("\nEnter FirstName: ");
	    String myString = input.next();
	    System.out.println("\nYour Name : " + myString);
	    System.out.println("\nEnter last Name: ");
	    String myString = input.next();
	    System.out.println("\nYour last : " + myString);
	    System.out.println("\nEnter Course: ");
	    String myString = input.next();
	    System.out.println("\nYour Your Course is : " + myString);
	  }
	}
