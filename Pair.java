/**
 * TODO: ทำให้คลาสนี้เป็น Generic <K, V> ที่สามารถเก็บอ็อบเจกต์ได้ 2 ชนิด
 */
public class Pair<K,V> {
    private final K Key ;
    private final V Value;
    // TODO: สร้างฟิลด์ private final สำหรับ key และ value
    
    // TODO: สร้าง Constructor ที่รับ key และ value
    public Pair(K Key,V Value){
        this.Key = Key;
        this.Value = Value;
    }
    

    // TODO: สร้าง Getters สำหรับ key และ value
    public K getKey(){
        return Key;
    }
    public V getValue(){
        return Value;
    }

}