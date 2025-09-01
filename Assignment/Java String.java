import java.util.Scanner;

public class day_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1
               /* String a =sc.next();
                int v = 0, c = 0;
                a = a.toLowerCase();
                for (int i = 0; i < a.length(); i++) {
                    char d = a.charAt(i);
                    if (d >= 'a' && d <= 'z') {
                        if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') v++;
                        else c++;
                    }
                }
                System.out.println("Vowels: " + v);
                System.out.println("Consonants: " + c);
            }
        }
*/
        //2
                /*String a = sc.next();
                String b = "";
                for (int i = a.length() - 1; i >= 0; i--) b = b + a.charAt(i);
                System.out.println(b);
            }
        }*/
        //3

               /* String a = sc.next();
                String b = "";
                for (int i = a.length() - 1; i >= 0; i--) b = b + a.charAt(i);
                if (a.equals(b)) System.out.println("Palindrome");
                else System.out.println("Not Palindrome");
            }
        }*/
        //4
                /*String a = sc.next();
                String b = "";
                for (int i = 0; i < a.length(); i++) {
                    char d = a.charAt(i);
                    if (b.indexOf(d) == -1) b = b + d;
                }
                System.out.println(b);
            }
        }
*/
        //5
                /*String a = sc.next();
                String[] b = a.split(" ");
                String d = "";
                for (int i = 0; i < b.length; i++) {
                    if (b[i].length() > d.length()) d = b[i];
                }
                System.out.println(d);
            }
        }*/
        //6

               /* String a = sc.next();
                String b = sc.next();
                int c = 0;
                for (int i = 0; i <= a.length() - b.length(); i++) {
                    String d = a.substring(i, i + b.length());
                    if (d.equals(b)) c++;
                }
                System.out.println(c);
            }
        }*/
        //7
                /*String a = sc.next();
                String b = "";
                for (int i = 0; i < a.length(); i++) {
                    char d = a.charAt(i);
                    if (d >= 'a' && d <= 'z') b = b + (char)(d - 32);
                    else if (d >= 'A' && d <= 'Z') b = b + (char)(d + 32);
                    else b = b + d;
                }
                System.out.println(b);
            }
        }*/
        //8
                /*String a = "apple";
                String b = "banana";
                int d = a.compareTo(b);
                if (d < 0) System.out.println(a + " comes before " + b);
                else if (d > 0) System.out.println(b + " comes before " + a);
                else System.out.println("Both are equal");
            }
        }*/
        //9

                /*String a = sc.next();
                int m = 0;
                char r = ' ';
                for (int i = 0; i < a.length(); i++) {
                    char d = a.charAt(i);
                    int c = 0;
                    for (int j = 0; j < a.length(); j++) {
                        if (a.charAt(j) == d) c++;
                    }
                    if (c > m) {
                        m = c;
                        r = d;
                    }
                }
                System.out.println(r);
            }
        }
*/
        //10

                /*String a = sc.next();
                char r = 'l';
                String b = "";
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) != r) b = b + a.charAt(i);
                }
                System.out.println(b);
            }
        }*/
        //11

                /*String a = sc.nextLine().toLowerCase();
                String b = sc.nextLine().toLowerCase();
                int[] f1 = new int[26];
                int[] f2 = new int[26];
                for (int i = 0; i < a.length(); i++) {
                    char d = a.charAt(i);
                    if (d >= 'a' && d <= 'z') f1[d - 'a']++;
                }
                for (int i = 0; i < b.length(); i++) {
                    char d = b.charAt(i);
                    if (d >= 'a' && d <= 'z') f2[d - 'a']++;
                }
                boolean r = true;
                for (int i = 0; i < 26; i++) {
                    if (f1[i] != f2[i]) {
                        r = false;
                        break;
                    }
                }
                if (r) System.out.println("Anagram");
                else System.out.println("Not Anagram");
            }
        }
*/
        //12








    }
}