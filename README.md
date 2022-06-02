
# Rapport External Libraries


## Val av bibliotek
I projektet kommer bild biblioteket picasso användas. Men varav att bild bibliotek
är mycket använda i Android Studio finns det en mängd olika. Däför testas ett annat stort
bildbibliotek här, nämligen Glide. En stor visuell skillnad mellan glide
och picasso är att glide stödjer gif. Just därför består denna enkla
applikation av två knappar som byter mellan två olika gifar i en ImageView och allt
detta med hjälp av glide.

För att använda glide så måste biblioteket importeras i appens gradle fil på det sätt som syns
i figur 1.1 nedan. När man sedan synkar om gradle är det möjligt att uttnytja bibliotekes funktioner i
ens egna java klasser. Just i detta fall görs en importen på det sätt som syns i figur 1.2.

```
    implementation 'com.github.bumptech.glide:glide:4.11.0'
```
_Figur 1.1 Implementera Glide i appen_

```
    import com.bumptech.glide.Glide;
```
_Figur 1.2 Importera Glide i en Java klass_

Vad som gjorts för att få en knapp att visa en glide är enligt figur 1.3 nedan.
Vad som händer är att när ett tryck registreras så startas en glide funktion. Och i detta
fallet så laddas glide som en gif från länken som finns beskrivet i strängen funnyGif, och allt
detta laddas i ImageViewn.

```
        funnyGif = "https://media0.giphy.com/media/JQFZzvTP7XmPBmcSdH/giphy.gif?cid=790b76116badb48a643a409aa892787306317f8ecedd6f34&rid=giphy.gif&ct=g";

        funny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Funny");
                Glide.with(MainActivity.this).asGif().load(funnyGif).into(imageView);
            }
        });
```
_Figur 1.3 Glide funktion för knapp_

För att få fram text med länk till copyright sida så har ett HTML anchor element används.
Som syns i figur 1.4 nedan har string.xml uppdaterats med just detta HTML värde som ledeer till
en hemsida. Sedan behöver länken aktiveras och detta görs med setMovementMethod som syns i figur 1.5.

```
    <string name="happyCop"><a href="https://giphy.com/gifs/despicable-me-minions-banana-HuGCwDXj4nQnS?utm_source=media-link&amp;utm_medium=landing&amp;utm_campaign=Media%20Links&amp;utm_term=">Copyright: Despicable Me Banana GIF</a></string>
    <string name="funnyCop"><a href="https://giphy.com/gifs/moodman-JQFZzvTP7XmPBmcSdH?utm_source=media-link&amp;utm_medium=landing&amp;utm_campaign=Media%20Links&amp;utm_term=">Copyright: Hamster Rotation GIF By MOODMAN</a></string>

```
_Figur 1.4 Sträng värde med anchor element_

```
        funnyCop.setMovementMethod(LinkMovementMethod.getInstance());
        happyCop.setMovementMethod(LinkMovementMethod.getInstance());

```
_Figur 1.5 Java för att aktivera länk_

## Video exempel

<img src="show.gif" width="50%">