
/**
 * Enumeration class Size - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Size {
    /**
     * Enumerates creation
     */
    SMALL(32, 36, "Pequeno",'S'),
    MEDIUM(37, 44, "Médio",'M'),
    LARGE(45, 52, "Grande",'L');
    
    /**
     * Attributes creation
     */
    private final String description;
    private final int minValue;
    private final int maxValue;
    
    private final char code;
    
    /**
     * Constructor creation
     */
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code; 
    }
    
    /**
     * Class Size methods
     */
    @Override
    public String toString() {
        return this.description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getMinValue() {
        return minValue;
    }
    
    public int getMaxValue() {
        return maxValue;
    }
    
    public char getCode() {
        return code;
    }
}
