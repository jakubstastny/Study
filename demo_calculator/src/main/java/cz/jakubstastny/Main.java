package cz.jakubstastny;

public class Main {

  public static void main(String[] args) {
    
    String[] statements = {
        "add 1.0",                  // Error: incorrect number of values
        "add xx 25.0",              // Error: non-numeric data
        "addX 0.0 0.0",             // Error: invalid command
        "Divide 100.0 50.0",        // 100.0 / 50.0 = 2.0
        "Add 25.0 92.0",            // 25.0 + 92.0 = 117.0
        "Subtract 255.0 17.0",      // 225.0 - 17.0 = 108.0
        "Multiply 11.0 3.0"         // 11.0 * 3.0 = 33.0
    };
    
    
    CalculateHelper helper = new CalculateHelper();
    for(String statement:statements) {
      try {
      helper.process(statement);
      System.out.println(helper);
      } catch (InvalidStatementException e) {
          System.out.println(e.getMessage());
          if(e.getCause() != null)
            System.out.println("   Original exception: " + e.getCause().getMessage());
      }
    }
  }

}
