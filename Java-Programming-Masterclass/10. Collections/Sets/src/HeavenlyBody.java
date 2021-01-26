import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public enum BodyTypes {
        STAR,
        PLANET,
        MOON,
        DWARF_PLANET
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody heavenlyBody) {
        return this.satellites.add(heavenlyBody);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public static Key makeKey(String name, BodyTypes bodyTypes) {
        return new Key(name, bodyTypes);
    }

    public Key getKey() {
        return key;
    }

    @Override
    public final boolean equals(Object heavenlyBody) {
        if (this == heavenlyBody) {
            return true;
        }
        if (heavenlyBody instanceof HeavenlyBody) {
            HeavenlyBody object = (HeavenlyBody) heavenlyBody;
            return this.key.equals(object.getKey());
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.name.hashCode() + this.key.bodyType.hashCode() + 57;
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + " " + this.orbitalPeriod;
    }

    public static class Key {
        private final String name;
        private final BodyTypes bodyType;

        public Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + this.bodyType.hashCode() + 57;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())) {
                return this.bodyType == (key.getBodyType());
            }

            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
