@teknolojikarama
Feature: Amazon Birden Fazla Arama
  Scenario Outline: TC05_kullanici amazonda urun arar
    Given kullanici amazon sayfasina gider
    And kullanici aramakutusuna "<urunler>" yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir

    Examples: Urun Isimleri
    |urunler   |
    |headphones|
    |camera    |
    |drone     |
    |pencil    |
    |tv        |
    |glass     |
    |book      |
    |java      |
    |techproed |
    |sponge    |
    |mouse     |