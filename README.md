# Voyager

Voyager, Jetpack Compose tabanlı uygulamalar için hafif ve esnek bir navigasyon kütüphanesidir. Ekranlar arasında geçiş yapmayı ve veri paylaşımını kolaylaştırarak geliştiricilere daha iyi bir kullanıcı deneyimi sunmayı hedefler.

## Neden Voyager Kullanılır?
![voyager](https://github.com/user-attachments/assets/be7576ae-7a0b-436a-980e-088083a5991e)

- **Basit ve Temiz API**: Voyager, kullanıcı dostu bir API sunarak geliştiricilerin hızlı ve verimli bir şekilde uygulama navigasyonunu yönetmesine olanak tanır.
- **Jetpack Compose ile Uyumlu**: Compose tabanlı projelerde kullanılmak üzere tasarlanmıştır, bu da modern Android uygulama geliştirme süreçlerine tam entegre olmasını sağlar.
- **Durum Yönetimi**: Voyager, ekranlar arasında geçiş yaparken durumu yönetmek için çeşitli yöntemler sunar, böylece uygulamanızın daha akıcı bir deneyim sunmasını sağlar.
- **Veri Paylaşımı**: Ekranlar arasında veri iletimini kolaylaştırır, böylece kullanıcıların etkileşimleri sırasında bilgi kaybını önler.

## Kurulum

### Gradle ile Ekleme

`build.gradle` (app modülünde) dosyanıza aşağıdaki bağımlılığı ekleyin:

```groovy
dependencies {
    implementation "cafe.adriel.voyager:voyager-core:<version>"
    implementation "cafe.adriel.voyager:voyager-android:<version>"
    implementation "cafe.adriel.voyager:voyager-compose:<version>"
}
