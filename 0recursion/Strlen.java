public class Strlen { 
  public static int strlen(String s) { 
    if (s.length() == 0) return 0;
    else return 1 + strlen(s.substring(1,s.length()));
  }

  public static void main(String[] main) { 
    System.out.println(strlen("abcdeg"));
  }
}
