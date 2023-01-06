public class Main {
    public static void main(String[] args) {
        pcSpecies thespecies = new pcSpecies();
        gpu theGpu = new gpu();
        cpu theCpu = new cpu();
        ram theRam = new ram();
        thespecies.species();
        theGpu.gpuMark();
        theCpu.cpuMark();
        theRam.ramMark();
    }
}