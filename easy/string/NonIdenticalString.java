// https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/check-non-identical-string-rotation/problem

  public static boolean isNonTrivialRotation(String s1, String s2) {
      if (s1.equals(s2) || s1.length() != s2.length()) {
          return false;
      }
      return (s1 + s1).contains(s2);
  }
