import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {

    int anzahlMitBibliothek = 0;
    for (int i = 0; i<1000000; i++) {
      LinkedHashSet<Integer> achtKarten = getAchtKarten();

      if (isBibliothekBeiBeidenEnthalten(achtKarten)) {
        anzahlMitBibliothek++;
      }
    }
    System.out.println(anzahlMitBibliothek);
  }

  private static boolean isBibliothekEnthalten(LinkedHashSet<Integer> achtKarten) {
    for (Integer karte: achtKarten) {
      if (karte == 0 || karte == 1 || karte == 2)
        return true;
    }
    return false;
  }

  private static boolean isBibliothekBeiBeidenEnthalten(LinkedHashSet<Integer> achtKarten) {
    boolean bibForSpieler1 = false;
    boolean bibForSpieler2 = false;

    int kartenNummer = 1;
    for (Integer karte : achtKarten) {
      if (karte == 0 || karte == 1 || karte == 2) {
        if (kartenNummer <= 4) {
          bibForSpieler1 = true;
        } else {
          bibForSpieler2 = true;
        }
      }
      kartenNummer++;
      if (bibForSpieler1 && bibForSpieler2) {
        System.out.println(achtKarten);
        return true;
      }
    }
    return false;
  }


  private static LinkedHashSet<Integer> getAchtKarten() {
    LinkedHashSet<Integer> achtKarten = new LinkedHashSet<>();
    while(achtKarten.size() < 8) {
      achtKarten.add((int) (Math.random()*142));
    }
//    System.out.println(achtKarten);
    return achtKarten;
  }

//  boolean isBiblitiothek(){
//    return Math.random()*33;
//  }

  static int getEinsAus47() {
    return (int) (Math.random() * 47 + 1);
  }

}

class Item {
  private String name;
  private String category;
  private double price;

  public Item(String name, String category, double price) {
    this.name = name;
    this.category = category;
    this.price = price;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
