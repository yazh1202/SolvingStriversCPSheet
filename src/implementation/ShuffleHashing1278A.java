package implementation;

import java.util.*;

import static java.lang.System.in;

public class ShuffleHashing1278A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int tc = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < tc; i++) {
            String org = sc.nextLine();
            String hash = sc.nextLine();
            findTruthPreprocessedBetter(org, hash);
        }
    }

    /*Total BruteForcing, works but has O((S2-S1)*S1+S1) time complexity
    due to checking for each possible substring of length equal to original string
    and then checking the hashmap for matching, also has O(S1) Time Complexity*/
    private static void findTruth(String org, String hash) {
        char[] o = org.toCharArray();
        char[] h = hash.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        //Putting all characters in hashmap
        for (char c : o) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
                continue;
            }
            hm.put(c, 1);
        }
        //Comparing substrings
        for (int i = 0; i < h.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            int j = i;
            while (j < h.length && j < i + o.length) {
                if (temp.containsKey(h[j])) {
                    temp.put(h[j], temp.get(h[j]) + 1);

                } else {
                    temp.put(h[j], 1);
                }
                j++;
            }
            if (temp.size() != hm.size()) {
                continue;
            }
            boolean is = true;
            for (char c : o) {
                if (temp.containsKey(c) && Objects.equals(temp.get(c), hm.get(c))) {
                    continue;
                }
                is = false;
            }
            if (is) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    //Using Sorting to check every substring of length equal to original array, take more time
    //TC = O(n^2*log n)
    private static void findTruthSorted(String org, String hash) {
        char[] temp = org.toCharArray();
        Arrays.sort(temp);
        org = String.valueOf(temp);
        for (int i = 0; i < hash.length(); i++) {
            StringBuilder strb = new StringBuilder();
            for (int j = i; j < hash.length() && j < i + org.length(); j++) {
                strb.append(hash.charAt(j));
            }
            char[] cr = strb.toString().toCharArray();
            Arrays.sort(cr);
            if (String.valueOf(cr).equals(org)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    //Using array preprocessing and taking advantage of the fact that there are only 26 letters
    //Has O(n^2) time complexity as sorting is avoided
    private static void findTruthPreprocessed(String org, String hash) {
        int[] oarr = new int[26];
        for (int i = 0; i < org.length(); i++) {
            oarr[org.charAt(i) - 'a']++;
        }

        for (int i = 0; i < hash.length(); i++) {
            int[] temp = new int[26];
            for (int j = i; j < hash.length() && j < i + org.length(); j++) {
                temp[hash.charAt(j) - 'a']++;
            }
            boolean is = true;
            for (int k = 0; k < 26; k++) {
                if (temp[k] != oarr[k]) {
                    is = false;
                    break;
                }
            }
            if (is) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    //Second to Final Optimization which involves improving the preprocessed array4
    //by realizing that we could initialize the second preprocessed array and then
    //just decrease the letter frequency of letter at the beginning and add to the frequency of new letter
    private static void findTruthPreprocessedBetter(String org, String hash) {
        int[] oarr = new int[26];
        for (int i = 0; i < org.length(); i++) {
            oarr[org.charAt(i) - 'a']++;
        }
        if (hash.length() < org.length()) {
            System.out.println("NO");
            return;
        }
        int[] temp = new int[26];
        for (int j = 0; j < org.length(); j++) {
            temp[hash.charAt(j) - 'a']++;
        }
        boolean is = true;
        for (int k = 0; k < 26; k++) {
            if (temp[k] != oarr[k]) {
                is = false;
                break;
            }
        }
        if (is) {
            System.out.println("YES");
            return;
        }
        for (int i = org.length(); i < hash.length(); i++) {
            temp[hash.charAt(i) - 'a']++;
            temp[hash.charAt(i - org.length()) - 'a']--;
            is = true;

            for (int k = 0; k < 26; k++) {
                if (temp[k] != oarr[k]) {
                    is = false;
                    break;
                }
            }
            if (is) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

}

//    private static void findTruthPreprocessedBest(String org, String hash) {
//        int[] oarr = new int[26];
//        boolean[] arr = new boolean[26];
//        int boolcount = 0;
//        for (int i = 0; i < org.length(); i++) {
//            oarr[org.charAt(i) - 'a']++;
//        }
//        if (hash.length() < org.length()) {
//            System.out.println("NO");
//            return;
//        }
//        int[] temp = new int[26];
//        for (int j = 0; j < org.length(); j++) {
//            temp[hash.charAt(j) - 'a']++;
//        }
//        for (int k = 0; k < 26; k++) {
//            if (temp[k] != oarr[k]) {
//                break;
//            }
//            boolcount++;
//        }
//        if (boolcount == org.length()) {
//            System.out.println("YES");
//            return;
//        }
//        for (int i = org.length(); i < hash.length(); i++) {
//            temp[hash.charAt(i) - 'a']++;
//            temp[hash.charAt(i - org.length()) - 'a']--;
//            is = true;
//
//            for (int k = 0; k < 26; k++) {
//                if (temp[k] != oarr[k]) {
//                    is = false;
//                    break;
//                }
//            }
//            if (is) {
//                System.out.println("YES");
//                return;
//            }
//        }
//        System.out.println("NO");
//    }

