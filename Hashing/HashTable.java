package javaDSAfreeCodeCamp.Hashing;

import java.hashhmaps;
import java.util.HashSet;
import java.util.Set;

public class HashTable {


    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;
    
    public HashTable(){
        this(10); 
    }

    public HashTable(int capacity){
        this.numOfBuckets = capacity;
        buckets = new HashNode[numOfBuckets];
    }

    public class HashNode{
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key , String value){
            this.key = key;
            this.value = value;
        }

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
    public int getBucketIndex(Integer key){
        return key % buckets.length;
    }

    public void put(Integer key , String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("key or value is null!");
        }
        int BucketIndex = getBucketIndex(key);
        HashNode head = buckets[BucketIndex];

        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = buckets[BucketIndex];
        HashNode newnode = new HashNode(key , value);
        newnode.next = head;
        buckets[BucketIndex] = newnode;
    }

    public String getValue(Integer key){
        int BucketIndex = getBucketIndex(key);
        HashNode head = buckets[BucketIndex];

        while(head != null){
            if(head.key == key){
                return head.value;
            }
            head = head.next;
        }
        // return "Key not found";
        return null;
    }   

    // public void removeKey(Integer Key){
    //     int bucketIndex = getBucketIndex(Key);
    //     HashNode head = buckets[bucketIndex];
    //     HashNode temp = head;
        
    //     while(head != null){
    //         if(head.key.equals(Key)){
    //             if(head.next != null){
    //                 temp = temp.next;
    //                 buckets[bucketIndex] = temp;
    //                 size--;
    //                 return;
    //             }else{
    //                 buckets[bucketIndex] = null;
    //                 size--;
    //                 return;
    //             }
    //         }
    //         head = head.next;
    //     }

    //     System.out.println("key not found");
    // }

    public String remove(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is Null!");
        }
        int BucketIndex = getBucketIndex(key);
        HashNode head = buckets[BucketIndex];
        HashNode previous = null;

        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }

        size--;
        if(previous != null){
            previous.next = head.next;
        }else{
            buckets[BucketIndex] = head.next;
        }

        return head.value;
    }


    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(105, "John");
        table.put(31, "Sana");
        table.put(21, "tom");
        table.put(0, "Tommy");
        // System.out.println(table.getValue(105));
        // System.out.println(table.getValue(21));

        // System.out.println(table.size());
        // table.removeKey(21);
        // System.out.println(table.size);
        // System.out.println(table.getValue(31));
        // System.out.println(table.getValue(21));
    }



    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }

    
}