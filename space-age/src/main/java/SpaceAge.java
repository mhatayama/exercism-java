class SpaceAge {
    static double ONE_YEAR_SECONDS = 31557600;
    static double MARCURY_EARTH_RATIO = 0.2408467;
    static double VENUS_EARTH_RATIO = 0.61519726;
    static double MARS_EARTH_RATIO = 1.8808158;
    static double JUPITER_EARTH_RATIO = 11.862615;
    static double SATURN_EARTH_RATIO = 29.447498;
    static double URANUS_EARTH_RATIO = 84.016846;
    static double NEPTUNE_EARTH_RATIO = 164.79132;
    double seconds;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / ONE_YEAR_SECONDS;
    }

    double onMercury() {
        return onEarth() / MARCURY_EARTH_RATIO;
    }

    double onVenus() {
        return onEarth() / VENUS_EARTH_RATIO;
    }

    double onMars() {
        return onEarth() / MARS_EARTH_RATIO;
    }

    double onJupiter() {
        return onEarth() / JUPITER_EARTH_RATIO;
    }

    double onSaturn() {
        return onEarth() / SATURN_EARTH_RATIO;
    }

    double onUranus() {
        return onEarth() / URANUS_EARTH_RATIO;
    }

    double onNeptune() {
        return onEarth() / NEPTUNE_EARTH_RATIO;
    }

}
