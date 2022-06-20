

function prediction(number) {
    var number = Math.floor(Math.random() * 10)
    var count = 1;
    for (let i = 0; i < 5; i++) {
        var data = prompt("1 ile 10 arasında bir tahmin giriniz : ")
        if (count <= 5) {
            if (data < number) {
                alert("Girdiğiniz değer tahmin edilen sayıdan küçük");
                count++
            } else if (data > number) {
                alert("Girdiğiniz değer tahmin edilen sayıdan büyük");
                count++
            } else {
                alert("Sayıyı " + count + ". tahminde buldunuz. Tebrikler!!! Sayı = " + number);
                break
            }
        }

    }
}

prediction()