package Module_SinglyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();

        String nip;
        String nama;
        String devisi;
        int pilih;

        do {
            System.out.println("=== DATA PEGAWAI ===");
            System.out.println("1. INPUT DATA");
            System.out.println("2. HAPUS DATA");
            System.out.println("3. TAMPILKAN SELURUH DATA");
            System.out.println("4. Keluar");
            System.out.println("Masukan Pilihan Anda");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukan Data Pegawai");
                    System.out.print("NIP : ");
                    nip = input.next();
                    System.out.print("Nama : ");
                    nama = input.next();
                    System.out.print("Divisi : ");
                    devisi = input.next();
                    Pegawai listPegawai = new Pegawai(nip, nama, devisi);

                    System.out.println("Tambahkan data diawal list (y/n)");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.out.println("Menambahkan data diawal list");
                        linkedList.insertAtFront(listPegawai);
                    } else {
                        System.out.println("Menambahkan data diakhir list");
                        linkedList.insertAtBack(listPegawai);
                    }
                    System.out.println();
                    break;


                case 2:
                    System.out.println("Hapus data di awal list? (y/n)");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.out.println("Menghapus data diawal list");
                        linkedList.removeFromFront();
                    } else {
                        System.out.println("Menambahkan data diakhir list");
                        linkedList.removeFromBack();
                    }
                    System.out.println();
                    break;


                case 3:
                    System.out.println("=== DATA PEGAWAI ===");
                    System.out.println();
                    linkedList.print();
            }

                    }while (pilih != 4);
                }
            }
