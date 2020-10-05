Feature: Ebayda Arama
  @ebayarama
  Scenario Outline: TC06_kullanici ebayda urun arar
    Given kullanici "http://ebay.com" sayfasina gider
    And kullanici ebayda aramakutusuna "<urunler>" yazar
    Then kullanici ebaydaki sonuc sayisini ekrana yazar

    Examples: Test Verileri
    |urunler      |
    |araba        |
    |bebek arabası|
    |bisiklet     |