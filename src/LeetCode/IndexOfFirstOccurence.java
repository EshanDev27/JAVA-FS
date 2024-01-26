package LeetCode;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {
        IndexOfFirstOccurence a = new IndexOfFirstOccurence();
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(a.strStr(haystack, needle));
    }

    int strStr(String haystack, String needle){
        if(!haystack.contains(needle)){
//            System.out.println("IF wala -1");
            return -1;
        }

        int needleLength = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }
//        System.out.println("end wala -1");
        return -1;
    }
}

// needle = leet ; haystack = leeleet