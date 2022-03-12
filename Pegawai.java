package Module_SinglyLinkedList;

public class Pegawai{
    private final String nip;
    private final String nama;
    private final String devisi;

    //Cara cepat (alt + insert) -> constructor
    //Constructor adalah Method yg sama dengan nama Class
    public Pegawai(String nip, String nama, String devisi) {
        this.nip = nip;
        this.nama = nama;
        this.devisi = devisi;
    }

    //Cara cepat (alt + insert) -> Getter
    public String getNip(){
        return nip;
    }

    //Cara cepat (alt + insert) -> toString
    @Override
    public String toString() {
        return "NIP= " + nip + " NAMA= " + nama + " DEVISI= " + devisi + ", ";
    }
}

