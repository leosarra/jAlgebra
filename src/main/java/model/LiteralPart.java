package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LiteralPart {
    private final Map<String,Integer> map;
    public LiteralPart (Map<String, Integer> expMap) {
        this.map = new HashMap<>(expMap);
    }

    public LiteralPart () {
        this.map = new HashMap<>();
    }


    public boolean hasLiteral(String literal) {
        return map.containsKey(literal);
    }


    public Map<String, Integer> getLiterals() {
        return map;
    }


    public Integer getExponent(String literal) {
        if (!hasLiteral(literal)) return null;
        return map.get(literal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiteralPart that = (LiteralPart) o;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }


    public LiteralPart copy() {
        return new LiteralPart(this.getLiterals());
    }


    @Override
    public String toString() {
        return "LiteralPart{" +
                "map=" + map +
                '}';
    }
}
