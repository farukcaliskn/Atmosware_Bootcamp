function numberEntry() {
    var number = prompt("Bitiş sayısını giriniz : ");
    return number;
}

function array() {
    for (var i = 1; i <= number; i++) {
        dizi.push(Math.floor(Math.random() * 10));
    }
}

function calculate() {

    for (var i = 0; i <= dizi.length - 1; i++) {

        if (dizi[i] % 2 == 0) {
            evenSum += dizi[i]
        }


        if (dizi[i] % 2 == 1) {
            oddSum += dizi[i]
        }
        sum += dizi[i];
    }
}

function sumByOne() {
    for (let i = 0; i < dizi.length; i++) {
        dizi[i] = dizi[i] + 1;
    }

}


var sum = 0;
var evenSum = 0;
var oddSum = 0;
var dizi = [];
number = numberEntry();
array();
document.write("Dizinin elemanları : " + dizi + "<br>")
document.write("Dizinin 1. elemanı : " + dizi[0] + "<br>")
document.write("Dizinin son elemanı" + dizi[dizi.length - 1] + "<br>")
document.write("Dizinin küçükten büyüğe sıralanmış hali" + dizi.sort() + "<br>")
document.write("Dizinin büyükten küçüğe sıralanmış hali" + dizi.sort().reverse() + "<br>")
calculate();
document.write("Toplam:" + sum + '<br>')
document.write('çift Sayı toplamı: ' + evenSum + '<br>')
document.write('tek Sayı toplamı: ' + oddSum + '<br>')
sumByOne();
document.write("Dizinin elemanlarının 1 artırılmış hali :" + dizi.sort())