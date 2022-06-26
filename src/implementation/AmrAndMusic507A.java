package implementation;

import java.util.*;

import static java.lang.System.in;

public class AmrAndMusic507A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        calcTimeStack(n, k, arr);
    }

    static void calcTimeStack(int n, int k, int[] arr) {
        int[] temp = new int[n];
        System.arraycopy(arr, 0, temp, 0, n);
        Arrays.sort(temp);
        int sum = 0;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int j : temp) {
            if (sum + j <= k) {
                ls.add(j);
            } else {
                break;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();

        for (int s = 0; s < arr.length; s++) {
            if (ls.contains(arr[s])) {
                res.add(s);
                ls.remove(arr[s]);
            }
        }
        for (int a : res) {
            System.out.print(a + 1 + " ");
        }
    }

    static void calcTime(int n, int k, int[] arr) {
        int[] temparr = new int[n];
        //Creating Deep Copy
        System.arraycopy(arr, 0, temparr, 0, n);
        //Sorting
        Arrays.sort(temparr);
        int sum = 0;
        //Now using hashmaps
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int j : temparr) {
            if (sum + j <= k) {
                sum += j;
                if (hm.containsKey(j)) {
                    hm.put(j, hm.get(j) + 1);
                    continue;
                }
                hm.put(j, 1);
            } else {
                break;
            }
        }
        int size = 0;
        for (int i : hm.values()) {
            size += i;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int t = 0; t < arr.length; t++) {
            if (hm.size() == 0) {
                break;
            }
            if (hm.containsKey(arr[t])) {
                hm.put(arr[t], hm.get(arr[t]) - 1);
                res.add(t);
                if (hm.get(arr[t]) == 0) {
                    hm.remove(arr[t]);
                }
            }
        }
        System.out.println(size);
        for (int i : res) {
            System.out.print(i + 1 + " ");
        }
    }
}

